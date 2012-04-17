package lu.brainsourcing.resume.manager.client;

public interface Resume extends com.google.gwt.i18n.client.Messages {
  @Key("manage.resume.header")
  String manageResumeHeader();
  @Key("link.administration")
  String linkAdministration();
  @Key("administration.header")
  String administrationHeader();
  @Key("my.account.header")
  String myAccountHeader(String arg0);
  @Key("resume.header")
  String resumeHeader();
  @Key("link.logout")
  String linkLogout();
}
