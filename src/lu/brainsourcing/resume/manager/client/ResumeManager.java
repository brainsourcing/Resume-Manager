package lu.brainsourcing.resume.manager.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ResumeManager implements EntryPoint {

	private MainScreen mainScreen = new MainScreen();
	// private static final LoginServiceAsync loginService = GWT.create(ExtendedLoginService.class);
	

	public void onModuleLoad() {
		// Load interface with UIBinder
				RootPanel.get().add(mainScreen);
				// Make call to the server to see if use have the ROLE_ADMIN to show link
				
//				// If we are logged in, show the logout link
//				final LoginDialog loginDialog = DefaultSecurityLoginFactory.getInstance().getLoginDialog();
//				
//				loginDialog.setPostLogin(new PostLoginInterface() {
//					
//					@Override
//					public void postLogin(ClientSecurityInformation userInformation) {
//						loginDialog.hide();
//						mainScreen.setUserInformation(userInformation);
//					}
//				});
//				loginService.isLogged(new AbstractSecurityCallback() {
//
//					@Override
//					public void onSuccess(Object result) {
//						Boolean islogged = (Boolean)result;
//						if (!islogged) {
//							loginDialog.show();
//						}
//					}
//
//					@Override
//					public void onAccessDenied(Throwable caught) {
//						loginDialog.show();
//					}
//
//					@Override
//					public void _onFailure(Throwable caught) {
//						// TODO Auto-generated method stub
//						
//					}
//				});
				
	}
}
