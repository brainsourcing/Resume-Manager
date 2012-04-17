package lu.brainsourcing.resume.manager.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainScreen_MainScreenUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, lu.brainsourcing.resume.manager.client.MainScreen>, lu.brainsourcing.resume.manager.client.MainScreen.MainScreenUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final lu.brainsourcing.resume.manager.client.MainScreen owner) {

    lu.brainsourcing.resume.manager.client.MainScreen_MainScreenUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (lu.brainsourcing.resume.manager.client.MainScreen_MainScreenUiBinderImpl_GenBundle) GWT.create(lu.brainsourcing.resume.manager.client.MainScreen_MainScreenUiBinderImpl_GenBundle.class);
    lu.brainsourcing.resume.manager.client.MainScreen_MainScreenUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.DecoratedStackPanel stackMenu = owner.stackMenu;
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel f_SplitLayoutPanel3 = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_Label2.setText("totototototottototototototoototototototototootototo");
    f_VerticalPanel1.add(f_Label2);
    f_SplitLayoutPanel3.addWest(stackMenu, 200);
    f_Label4.setText("Content");
    f_SplitLayoutPanel3.add(f_Label4);
    f_VerticalPanel1.add(f_SplitLayoutPanel3);



    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_VerticalPanel1;
  }
}
