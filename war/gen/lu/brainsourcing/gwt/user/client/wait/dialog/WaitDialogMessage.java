package lu.brainsourcing.gwt.user.client.wait.dialog;

public interface WaitDialogMessage extends com.google.gwt.i18n.client.Messages {
  @Key("brainsourcing.service.name")
  String brainsourcingServiceName();
  @Key("brainsourcing.status.running")
  String brainsourcingStatusRunning();
  @Key("brainsourcing.status.cancelled")
  String brainsourcingStatusCancelled();
  @Key("default.service")
  String defaultService();
  @Key("brainsourcing.status.error")
  String brainsourcingStatusError();
  @Key("brainsourcing.service.status")
  String brainsourcingServiceStatus();
  @Key("brainsourcing.status.stopped")
  String brainsourcingStatusStopped();
  @Key("brainsourcing.status.created")
  String brainsourcingStatusCreated();
  @Key("wait.dialog.please.wait")
  String waitDialogPleaseWait();
  @Key("brainsourcing.status.finished")
  String brainsourcingStatusFinished();
}
