package lu.brainsourcing.resume.manager.server.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class User {

	@Id
	@Column(name = "id")
	protected Long id;
	
	@Version
	@Column(name = "version")
	protected Integer version;
	
	@Basic
	@Column(unique=true, name="username")
	private String username;
	
	@Basic
	@Column(name = "pass")
	private String password;
	
	@Basic
	@Column(name = "salt")
	private Long salt;
	
	@Basic
	@Column(name = "enabled")
	private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getSalt() {
		return salt;
	}

	public void setSalt(Long salt) {
		this.salt = salt;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public static Long countUser() {
		return 0L;
	}
	
	public static User findUser(Long id) {
		return new User();
	}
}
