package lu.brainsourcing.resume.manager.client.request;

import lu.brainsourcing.gwt.security.client.LoginBox;
import lu.brainsourcing.gwt.user.client.DefaultWaitDialogFactory;
import lu.brainsourcing.gwt.user.client.wait.dialog.TaskDef;
import lu.brainsourcing.gwt.user.client.wait.dialog.WaitDialog;
import lu.brainsourcing.resume.manager.shared.UserProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.ServerFailure;
import com.gwt.ss.client.loginable.HasLoginHandler;
import com.gwt.ss.client.loginable.LoginEvent;
import com.gwt.ss.client.loginable.LoginHandler;

public class TestUserRequest {

	
	public void testUserFactory() {
		UserRequestFactory userRequestFactory = GWT.create(UserRequestFactory.class);
		
		UserRequest userRequest = userRequestFactory.getUserRequest();
		
		Request<UserProxy> request = userRequest.findUser(1L);
		final WaitDialog waitDialog = DefaultWaitDialogFactory.getInstance().getWaitDialog();
		final TaskDef taskDef = new TaskDef(10);
		taskDef.setKeyDescription("loading.user.information");
		Receiver receiver = new Receiver<UserProxy>() {

			private Receiver<UserProxy> originalReceiver;
			private Request<UserProxy> originalRequest;
					
			@Override
			public void onFailure(ServerFailure error) {
				if (error.getExceptionType().contains("GwtAccessDeniedException") 
						|| errorNotAnInstanceOfGwtSecurityException(error.getExceptionType())
						|| getHasLoginHandler() == null  
					) {
						originalReceiver.onFailure(error);
					} else {
						LoginHandler lh = new LoginHandler() {
						      
				               private HandlerRegistration hr;
				      
				               @Override
				               public void setLoginHandlerRegistration(HandlerRegistration hr) {
				                      this.hr = hr;
				               }
				      
				               @Override
				               public void onLogin(LoginEvent e) {
				                   if (hr != null) {
				                               hr.removeHandler();
				                   }
				                   GWT.log("Receive login "+(e.isCanceled()?"cancel":"succeed")+" event!");
				                   if(e.isCanceled()){
				                	   ServerFailure servFailure = new ServerFailure("com.gwt.ss.client.loginable.LoginCancelException");
				                	   	originalReceiver.onFailure(servFailure);
				                          
				                   } else {
				                          Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
				                             @Override
				                             public void execute() {
				                                 waitDialog.stop(taskDef);
				                                 originalRequest.fire(originalReceiver);
				                             }
				                          });
				                   }
				               }
				          };
				      lh.setLoginHandlerRegistration(getHasLoginHandler().addLoginHandler(lh));
				      getHasLoginHandler().startLogin(new RuntimeException());
					}
			}

			private HasLoginHandler getHasLoginHandler() {
				return LoginBox.getLoginBox();
			}

			private boolean errorNotAnInstanceOfGwtSecurityException(
					String exceptionType) {
				boolean isAGwtSecurityException = exceptionType.contains("GwtAccessDeniedException") 
						|| exceptionType.contains("GwtSecurityException")
						|| exceptionType.contains("GwtAccountExpiredException")
						|| exceptionType.contains("GwtAccountStatusException")
						|| exceptionType.contains("GwtAuthenticationException")
						|| exceptionType.contains("GwtBadCredentialsException")
						|| exceptionType.contains("GwtCredentialsExpiredException")
						|| exceptionType.contains("GwtLockedException")
						|| exceptionType.contains("GwtSessionAuthenticationxception")
						|| exceptionType.contains("GwtUsernameNotFoundException"); 
				return !isAGwtSecurityException;
			}

			@Override
			public void onSuccess(UserProxy response) {
				originalReceiver.onSuccess(response);
				
			}
		};
		
		request.fire(receiver);
	}
	
}
