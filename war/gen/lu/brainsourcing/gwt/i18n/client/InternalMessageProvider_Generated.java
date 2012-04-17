package lu.brainsourcing.gwt.i18n.client;

import java.util.Map;
import java.util.HashMap;
import com.google.gwt.core.client.GWT;
import lu.brainsourcing.gwt.i18n.client.InternalMessageProvider;

public class InternalMessageProvider_Generated implements lu.brainsourcing.gwt.i18n.client.InternalMessageProvider {
  private lu.brainsourcing.gwt.user.client.wait.dialog.WaitDialogMessage _WaitDialogMessage = GWT.create(lu.brainsourcing.gwt.user.client.wait.dialog.WaitDialogMessage.class);
  private lu.brainsourcing.resume.manager.client.Resume _Resume = GWT.create(lu.brainsourcing.resume.manager.client.Resume.class);
  private static Map<String, String> map = new HashMap<String,String>();
  {
     map.put("brainsourcing.service.name", _WaitDialogMessage.brainsourcingServiceName());
     map.put("brainsourcing.status.running", _WaitDialogMessage.brainsourcingStatusRunning());
     map.put("brainsourcing.status.cancelled", _WaitDialogMessage.brainsourcingStatusCancelled());
     map.put("default.service", _WaitDialogMessage.defaultService());
     map.put("brainsourcing.status.error", _WaitDialogMessage.brainsourcingStatusError());
     map.put("brainsourcing.service.status", _WaitDialogMessage.brainsourcingServiceStatus());
     map.put("brainsourcing.status.stopped", _WaitDialogMessage.brainsourcingStatusStopped());
     map.put("brainsourcing.status.created", _WaitDialogMessage.brainsourcingStatusCreated());
     map.put("wait.dialog.please.wait", _WaitDialogMessage.waitDialogPleaseWait());
     map.put("brainsourcing.status.finished", _WaitDialogMessage.brainsourcingStatusFinished());
     map.put("manage.resume.header", _Resume.manageResumeHeader());
     map.put("link.administration", _Resume.linkAdministration());
     map.put("administration.header", _Resume.administrationHeader());
     map.put("resume.header", _Resume.resumeHeader());
     map.put("link.logout", _Resume.linkLogout());
  }
  public String getString(String key, String ... args) {
       String retValue = map.get(key);
       if (retValue == null) {
           retValue = getParamString(key, args);
           if (retValue == null) {
               return "Undefined key : " + key;
           }
       }
       return retValue;
  }
  public String getParamString(String key, String ... args) {
       if ("my.account.header".equals(key)) {
                _Resume.myAccountHeader(args[0]);
       }
      return null;
  }
}
