package lu.brainsourcing.gwt.user.client.wait.dialog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle {
  private static SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GOWSV4FBEI{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String important(){
        return "GOWSV4FBEI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@lu.brainsourcing.gwt.user.client.wait.dialog.SimpleWaitDialogBox_SimpleWaitDialogBoxUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
