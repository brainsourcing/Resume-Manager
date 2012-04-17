package lu.brainsourcing.resume.manager.client.request;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface UserRequestFactory extends RequestFactory {

	public ExtendedUserRequest getUserRequest();
	
}
