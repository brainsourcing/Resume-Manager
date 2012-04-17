package lu.brainsourcing.resume.manager.client.request;

import lu.brainsourcing.gwt.user.facade.annotation.RequestExtendFor;
import lu.brainsourcing.gwt.user.facade.annotation.Secured;
import lu.brainsourcing.gwt.user.facade.annotation.Wait;
import lu.brainsourcing.resume.manager.shared.UserProxy;

import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;


@RequestExtendFor(requestClass=UserRequest.class, requestFactoryClass=UserRequestFactory.class)
public interface ExtendedUserRequest {

	
	Request<Long> countUser(Receiver<Long> receiver);
	
	@Wait(id=99,key="key.count")
	@Secured
	Request<UserProxy> findUser(Long id, Receiver<UserProxy> receiver);
}
