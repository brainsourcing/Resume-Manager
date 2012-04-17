package lu.brainsourcing.resume.manager.shared;

import java.util.Set;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwt.ss.client.exceptions.GwtSecurityException;

import lu.brainsourcing.gwt.user.facade.annotation.Secured;
import lu.brainsourcing.gwt.user.facade.annotation.Wait;
import lu.brainsourcing.gwt.user.facade.annotation.WaitType;


public interface MainScreenServiceAsync {

	@Secured
	@Wait(id=10,key="loading.user.information",waitType=WaitType.FIXED)
	void getMenuEntries(AsyncCallback<Set<Integer>> callback) throws GwtSecurityException;

}
