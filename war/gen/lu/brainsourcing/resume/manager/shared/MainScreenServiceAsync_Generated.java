package lu.brainsourcing.resume.manager.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.gwt.ss.client.exceptions.GwtAccessDeniedException;
import com.gwt.ss.client.exceptions.GwtSecurityException;
import com.gwt.ss.client.loginable.HasLoginHandler;
import com.gwt.ss.client.loginable.LoginEvent;
import com.gwt.ss.client.loginable.LoginHandler;
import com.gwt.ss.client.loginable.LoginableService;
import com.gwt.ss.client.loginable.LoginCancelException;
import lu.brainsourcing.gwt.user.client.wait.dialog.WaitDialog;
import lu.brainsourcing.gwt.user.client.DefaultWaitDialogFactory;
import lu.brainsourcing.gwt.user.client.wait.dialog.TaskDef;
import lu.brainsourcing.gwt.security.client.LoginBox;

public class MainScreenServiceAsync_Generated implements lu.brainsourcing.resume.manager.shared.MainScreenServiceAsync {
  public void getMenuEntries (final com.google.gwt.user.client.rpc.AsyncCallback<java.util.Set<java.lang.Integer>> callback) {
  lu.brainsourcing.resume.manager.shared.MainScreenServiceAsync realFacadeAsync = (lu.brainsourcing.resume.manager.shared.MainScreenServiceAsync) GWT.create(lu.brainsourcing.resume.manager.shared.MainScreenService.class);
  final TaskDef taskDef = new TaskDef(10);
  taskDef.setKeyDescription("loading.user.information");
  final WaitDialog waitDialog = DefaultWaitDialogFactory.getInstance().getWaitDialog();
  final com.google.gwt.user.client.rpc.AsyncCallback<java.util.Set<java.lang.Integer>> finalCallback = callback;
  com.google.gwt.user.client.rpc.AsyncCallback<java.util.Set<java.lang.Integer>> securedCallback = new com.google.gwt.user.client.rpc.AsyncCallback<java.util.Set<java.lang.Integer>>() {
    private HasLoginHandler getHasLoginHandler() {
      return LoginBox.getLoginBox();
    }
    @Override
    public void onSuccess(java.util.Set result) {
      waitDialog.finish(taskDef);
      finalCallback.onSuccess(result);
    }
    @Override
    public void onFailure(Throwable caught) {
       if(caught instanceof GwtAccessDeniedException || !(caught instanceof GwtSecurityException) || getHasLoginHandler()==null){
      waitDialog.error(taskDef);
           finalCallback.onFailure(caught);
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
                          callback.onFailure(new LoginCancelException("user cancel login process."));
                   } else {
                          Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
                             @Override
                             public void execute() {
                                 waitDialog.stop(taskDef);
      getMenuEntries(finalCallback);
                             }
                          });
                   }
               }
          };
      lh.setLoginHandlerRegistration(getHasLoginHandler().addLoginHandler(lh));
      getHasLoginHandler().startLogin(caught);
       }
    }
  };
  waitDialog.start(taskDef);
  // Call the realfacade with the "fake" callback
  realFacadeAsync.getMenuEntries(securedCallback);
  }
}
