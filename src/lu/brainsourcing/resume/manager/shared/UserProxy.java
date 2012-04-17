package lu.brainsourcing.resume.manager.shared;

import lu.brainsourcing.resume.manager.server.domain.User;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(User.class)
public interface UserProxy extends EntityProxy {

	
	public Long getId();

	public void setId(Long id);

	public Integer getVersion();

	public void setVersion(Integer version);

	public String getUsername();

	public void setUsername(String username);

	public String getPassword();

	public void setPassword(String password);

	public Long getSalt();

	public void setSalt(Long salt);

	public boolean isEnabled();

	public void setEnabled(boolean enabled);
	
}
