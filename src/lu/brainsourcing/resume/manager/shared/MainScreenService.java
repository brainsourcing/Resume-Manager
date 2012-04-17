package lu.brainsourcing.resume.manager.shared;

import java.util.Set;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.gwt.ss.client.exceptions.GwtSecurityException;


@RemoteServiceRelativePath("springGwtServices/mainScreenService")
public interface MainScreenService extends RemoteService {
	Set<Integer> getMenuEntries() throws GwtSecurityException;
}
