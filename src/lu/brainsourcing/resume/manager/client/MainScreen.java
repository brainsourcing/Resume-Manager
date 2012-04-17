package lu.brainsourcing.resume.manager.client;

import java.util.Set;

import lu.brainsourcing.gwt.i18n.client.I18N;
import lu.brainsourcing.resume.manager.client.request.UserRequest;
import lu.brainsourcing.resume.manager.client.request.UserRequestFactory;
import lu.brainsourcing.resume.manager.shared.ExtendedMainScreenService;
import lu.brainsourcing.resume.manager.shared.MainScreenServiceAsync;
import lu.brainsourcing.resume.manager.shared.MenuConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratedStackPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class MainScreen extends Composite {
	
	 private MainScreenServiceAsync mainScreenService = GWT.create(ExtendedMainScreenService.class);
	
	 public MainScreen() {
			
		 final EventBus eventBus = new SimpleEventBus();
		 UserRequestFactory requestFactory = GWT.create(UserRequestFactory.class);
		 requestFactory.initialize(eventBus);
		 
		 UserRequest userRequest = requestFactory.getUserRequest();
		 userRequest.countUser().fire(new Receiver<Long>() {

			@Override
			public void onSuccess(Long response) {
				Window.alert(response.toString());
			}
		});
		 
			// stackMenu = new DecoratedStackPanel();
			// My account Stack
			
//		    verticalPanel.add(splitPanel);
//		    splitPanel.addWest(stackMenu, 300);
		 
		 	verticalPanel.add(stackMenu);
		 	
			initWidget(verticalPanel);
			
			mainScreenService.getMenuEntries(new AsyncCallback<Set<Integer>>() {
				
				@Override
				public void onSuccess(Set<Integer> result) {
					
					updateScreen(result);
				}
				
				@Override
				public void onFailure(Throwable caught) {
					Window.alert("Cannot connect to server");
				}
			});
		}

	
	// fields
	// CHECKSTYLE:OFF (LFR GWT UI BINDER STUFF)
	VerticalPanel verticalPanel = new VerticalPanel();
	
	FlowPanel topPanel = new FlowPanel();
	
	DecoratedStackPanel stackMenu = new DecoratedStackPanel();
	
	SplitLayoutPanel splitPanel = new SplitLayoutPanel();
	// CHECKSTYLE:ON
	
	private static final ResumeImageBundle bundle = GWT.create(ResumeImageBundle.class);
	
	
	private String i18n(String key, String ... args) {
		return I18N.getInstance().getMessage(key, args);
	}
	
	private String getHeaderString(String text, ImageResource image) {
	    // Add the image and text to a horizontal panel
	    HorizontalPanel hPanel = new HorizontalPanel();
	    hPanel.setSpacing(0);
	    hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	    hPanel.add(new Image(image));
	    HTML headerText = new HTML(text);
	    headerText.setStyleName("cw-StackPanelHeader");
	    hPanel.add(headerText);

	    // Return the HTML string for the panel
	    return hPanel.getElement().getString();
	  }
	
	

	private void updateScreen(Set<Integer> result) {
		
		// My account header ==> always if ROLE_USER is set
		if (result.contains(MenuConstants.USER)) {
			String myAccountHeader = getHeaderString(i18n("my.account.header", "Logged User TODO"), bundle.myAccountIcon());
			
			stackMenu.add(new Label("ROLE_USER"), myAccountHeader, true);
		}
		
		if (result.contains(MenuConstants.CONSULTANT)) {
			String myResumeHeader = getHeaderString(i18n("resume.header"), bundle.resumeIcon());
			
			stackMenu.add(new Label("ROLE_CONSULTANT"), myResumeHeader, true);
		}
		
		if (result.contains(MenuConstants.STAFF)) {
			String manageResumeHeader = getHeaderString(i18n("manage.resume.header"), bundle.searchResumeIcon());
			
			stackMenu.add(new Label("ROLE_STAFF"), manageResumeHeader, true);
		}
		
		if (result.contains(MenuConstants.MANAGER)) {
			String adminHeader = getHeaderString(i18n("administration.header"), bundle.adminIcon());
			
			stackMenu.add(new Label("ROLE_MANAGER"), adminHeader, true);
		}
		
		
		
	}
	
	
}
