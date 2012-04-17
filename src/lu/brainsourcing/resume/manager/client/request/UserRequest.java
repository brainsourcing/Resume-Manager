package lu.brainsourcing.resume.manager.client.request;

import lu.brainsourcing.gwt.user.facade.annotation.ExtendForRequest;
import lu.brainsourcing.gwt.user.facade.annotation.Secured;
import lu.brainsourcing.gwt.user.facade.annotation.Wait;
import lu.brainsourcing.resume.manager.server.domain.User;
import lu.brainsourcing.resume.manager.shared.UserProxy;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import com.gwt.ss.client.exceptions.GwtSecurityException;

@Service(User.class)
@Wait(id=-1)
@ExtendForRequest(requestFactory=UserRequestFactory.class)
public interface UserRequest extends RequestContext {
	
	@Wait(id=99,key="key.count")
	@Secured
	Request<Long> countUser() throws GwtSecurityException;
	
	Request<UserProxy> findUser(Long id) throws GwtSecurityException;
}
