package lu.brainsourcing.resume.manager.server;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import lu.brainsourcing.resume.manager.shared.MainScreenService;
import lu.brainsourcing.resume.manager.shared.MenuConstants;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.gwt.ss.client.exceptions.GwtSecurityException;

public class MainScreenServiceImpl implements MainScreenService {

	@Secured(value={"ROLE_USER"})
	@Override
	public Set<Integer> getMenuEntries() throws GwtSecurityException {
		SecurityContext context = SecurityContextHolder.getContext();
		Set<Integer> setEntries = new HashSet<Integer>();
		
		if (context != null && context.getAuthentication() != null) {
			Authentication authentication = context.getAuthentication();
			Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
			for (GrantedAuthority grantedAuthority : authorities) {
				if (grantedAuthority != null) {
					if ("ROLE_USER".equals(grantedAuthority.getAuthority())) {
						setEntries.add(MenuConstants.USER);
					}
					if ("ROLE_CONSULTANT".equals(grantedAuthority.getAuthority())) {
						setEntries.add(MenuConstants.CONSULTANT);
					}
					if ("ROLE_ADMIN".equals(grantedAuthority.getAuthority())) {
						setEntries.add(MenuConstants.MANAGER);
					}
					if ("ROLE_STAFF".equals(grantedAuthority.getAuthority())) {
						setEntries.add(MenuConstants.STAFF);
					}
				}
			}
		}
		
		return setEntries;
	}

}
