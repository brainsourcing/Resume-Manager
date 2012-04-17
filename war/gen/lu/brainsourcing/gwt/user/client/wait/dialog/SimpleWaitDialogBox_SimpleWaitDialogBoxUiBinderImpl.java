package lu.brainsourcing.gwt.user.client.wait.dialog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox>, lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox.SimpleWaitDialogBoxUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox owner) {

    lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle) GWT.create(lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle.class);
    lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Image imageWait = owner.imageWait;
    com.google.gwt.user.client.ui.Image imageLoading = owner.imageLoading;
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.cellview.client.CellTable taskLists = owner.taskLists;
    com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel5 = new com.google.gwt.user.client.ui.DisclosurePanel("Details ...");
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    f_HorizontalPanel3.add(imageWait);
    f_HorizontalPanel3.add(imageLoading);
    f_VerticalPanel2.add(f_HorizontalPanel3);
    f_Label4.setText("Please Wait ...");
    f_Label4.setWidth("100%");
    f_VerticalPanel2.add(f_Label4);
    f_DisclosurePanel5.add(taskLists);
    f_DisclosurePanel5.setVisible(true);
    f_DisclosurePanel5.setAnimationEnabled(true);
    f_DisclosurePanel5.setWidth("100%");
    f_VerticalPanel2.add(f_DisclosurePanel5);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_VerticalPanel2, domId0Element);


    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
