package lu.brainsourcing.resume.manager.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public interface ResumeImageBundle  extends ClientBundle {
	
	 @Source("lu/brainsourcing/resume/manager/client/icon_my_account.gif")
	 @ImageOptions(height=32,width=32)
	 ImageResource myAccountIcon();
	 
	 @Source("lu/brainsourcing/resume/manager/client/resume-icon.png")
	 @ImageOptions(height=32,width=32)
	 ImageResource searchResumeIcon();
	 
	 @Source("lu/brainsourcing/resume/manager/client/icon-resume.gif")
	 @ImageOptions(height=32,width=32)
	 ImageResource resumeIcon();

	 @Source("lu/brainsourcing/resume/manager/client/Admin-icon.png")
	 @ImageOptions(height=32,width=32)
	 ImageResource adminIcon();
}
