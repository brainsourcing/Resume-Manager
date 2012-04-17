package lu.brainsourcing.resume.manager.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ResumeImageBundle_default_InlineClientBundleGenerator implements lu.brainsourcing.resume.manager.client.ResumeImageBundle {
  private static ResumeImageBundle_default_InlineClientBundleGenerator _instance0 = new ResumeImageBundle_default_InlineClientBundleGenerator();
  private void adminIconInitializer() {
    adminIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "adminIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 32, 32, false, false
    );
  }
  private static class adminIconInitializer {
    static {
      _instance0.adminIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return adminIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource adminIcon() {
    return adminIconInitializer.get();
  }
  private void myAccountIconInitializer() {
    myAccountIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "myAccountIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 32, 32, false, false
    );
  }
  private static class myAccountIconInitializer {
    static {
      _instance0.myAccountIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return myAccountIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource myAccountIcon() {
    return myAccountIconInitializer.get();
  }
  private void resumeIconInitializer() {
    resumeIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "resumeIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 32, 32, false, false
    );
  }
  private static class resumeIconInitializer {
    static {
      _instance0.resumeIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return resumeIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource resumeIcon() {
    return resumeIconInitializer.get();
  }
  private void searchResumeIconInitializer() {
    searchResumeIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "searchResumeIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 32, 32, false, false
    );
  }
  private static class searchResumeIconInitializer {
    static {
      _instance0.searchResumeIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return searchResumeIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource searchResumeIcon() {
    return searchResumeIconInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAADhElEQVR42tWW30uTURjH/SO68ka6ky66kS4yiLAClaSSMjeiHxDSRV3UKghDulhqKYZlycp+2lIKpR9MR2ySy/UDlpnmVKoNQlfdqAT2hqHf9j36rNNc9dpeLxp88N0573O+3/M85zwzI+N/+3z//AbGyAPMfnyJ2S+xOeLPMrak4t8ifhAY4ykxhtoVSybO3euoLKTAeN1srQkj9goz7z3AWFChi8mYGo/6FDTwNdJtnYmZoTvA2/vKhIjocFwRf49Mv3HD6G2y1oAgRn5BExZxywy8C/fBeHFujvii0wPXU2KELiT4+rRWwdi0DYT7ns2JawKyQ0UKYYGxaRt47Ov8mQHdhM78vC5uBCvR0+VN38AjbwcQcv3ZwG9MMDb9EoTDCN89AQzfVtfrj2ilGQ/UgLFpGxj9EEWL04ZPTy4mTrt0PJJ8Awi/+y4dQiQSseYmXDxbiXt1+xANXE40Ir0B6Q2KDcjbsB9Npw9hYmLCGgMejwcNpxwIXHNgqLNetWFMRhcwOfgQve2VaK8/CJfLZV0jYi3LyspQujUfnVcrMNbjQrSrYQHD3jpcqT6AvIJN1hpwOBxouXUdOTk5KNlhw53Gkwi0VmPk0XlF370z6I5/d1YcQ15eHpxOJ8rLy9M/A9wF4UGULFAgFAqho6UZN1cvw43NK9BasBJ+v1/NFxYWQuLcbrcaS8tALBZTgsFgEG1tbSoDfDYMYPB4EZ4fWY/YcD+mpqaUOAWZAUID5J+uY21trQrsDgSUMBeSnTEL9+Ml8W1ajuDeVRg4blPvUJzlElgGrsO/jDctznQykOK8Aaw/hTlG7Lt2w1aUr8RDhzfAZ8uBffs2ZYBwntBEVU2dWmNRpbDb7Srt3BWF5VDpu+OC/VWlGG3cg5ItRSguLlawDITPfIdxsolFnXoaYJCkUER1Go7uBDxHsG5jYcKAjpSE6acJrmnKAAX5QyI719PK7BAeRsI5eZY5QQzIjeBmzJUgLsSABeKLRDJFAzwL3JApA5mZmVizdt0vqdfrbwYR5zPNsInxTJkykJWVhezs7ESK9WtlhmQjFOeaps8A00/Xubm56kSLkb+ZkTnWn3HsF8wk4bjp1sxOp0zMLyQHyix8n7eABhjP2ptOv/5hyngbpAkl1zcZmacg36comxrb+T//HjCYLZlZ4V1ObssCewbHRZTm+SNm2T8lS/X5AfVb1HVCvaDLAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAADY0lEQVR42sWXC1MaQQzH9/t/h9ZXrU8eoqJQxZaiPITjQKGWWkXUapmxU8d2qnZsev9AruuygJRR/zPR80Tz22Q3ySpq6+7uD70MpDstmKaRUIZGPRsLZ+nV4jZNLRdoZrVIgbUyRTYqtJz8QLGtGq1l9mlj+zO9LRywbbpHlC43KFc5oXz1lC3l1tmXSOFLIlOzO28DwOB8fCHXAog6NBtzKbS+wwDR1J4PkMi1AJJO3Xfu7H0h9+MZW+nTOVut3mwB6CuHk8cWoHb2v7LBt3pK5yZEdvf4H8BTCwBIxbMCwJRsNF1nzct7G3FmxfF/F01WOoBvbn93bN6HA7SPWS8AGN7ZAI5OL7qeoAcByBm3ARSrx/yz/qwD6CvHsyjs1Yd+ED4AnON894uALQXybHPUD6DsOYcpKS42AOTeXI0OkC3XrY4OGk0Kxh26+nndE4BPgZTWfimwAei/A4xoYa3kgZf4e9Y9sALAOSqjQllFXe+Xgm4A+j6A5lcddqybTVKaFWo6moqui+8/2JGYRELCjnemEG7U91/XtxRPVTkCMADZhP6A5qTgPJzYHbqwIBLBeJFCb1w6Ob+kw5Nv/NxNcM6lGN1s6V11aICZ5W2aWynwigMxh4G65R9CW046h6TQy9FOh9HUYpYNELPRPIMUKsc9/wZzw3punxT6OGyY0I8FN2kinKbJhQy9jrRgsI96CYvG4pVMMKYW1116MZvsadc33gmYe08j8ykaDaQYZDy0xc+B1bz/OfwvUxhmsP9UutTg/mzLKcKpG95NL+V4hRCciUNAAEbATNiOtHnHH/VHyaw2SARS+Ro7BshkJMPhx+pHPQjI/LwtAhORHJuSgjCosNux2RAVBvHyv1s7ffDfYwKDKRkSBxXOPI6bgCACgwhdGKOAkq40qFDlUGhgSMegkkFISV82ZdZzs7Yj782Lq1ZR8fYEIgFDSpCOcS8i+sbs1q67Atiaihh2OZwj91LzEYlgrMjpwEkBIE7HfwM8tnwAbMBnBUBHAoCtGD2WcPx8AFyPJA2AeUrnfDXDSwwSAmGaHFOkSoYItFJcRNFMMEvMx0s03S6tqG6YMzHsyllnM6YrXIj927FczxEBVEXTOQzvAYDP4OaLDopZAg0FzieX8uwcK7zn3DLa6dfzv473m/YYCzsXAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACBElEQVR42t2Xy26jMBSG+5zVSEAKSRMSGs1rzMyi66q32U6VZbtI5w16eYGO1DYLIAHSQAgwAf6xnellU0wGrKhj6Ze8sA+f/2P74C1suG19KICcKIpjrtIse52T5/UBbG9/gqo1oarF0pq7aLd7+PrlW70A5dvKgXani7u7X9UBJElBR++xgGVEx9N2dHwCSVYKXeAC/Dg7I0F21lq/0lChKCrra1qrmgOnp9+hk9UjW+Dg9gmHN084ekcnRMhTdDo6ZLnB5jdbu9UBqP1ACuPSxd7wffWHDsJ4KQogIwBjjmyYnr85gD4BWPzepAM/bQQiAXrDSaH2hmNRDhjk8zn2r91iXU0QkzMvzAF6xfNEmxCA7E2BKbyEyThBDpBgpMgUqUU+NpvNBO2Bkg7kYvaA8bcoyZALJEkSbNsWk4LlclnKgTTNxDnQ2NG4ur9/fAGg6Tg/v6hWjgeDAWRlvXJMQZ4dqOWf0Oh9ZmnQuwZXdFxX77O9UBsADWZZFkzT5IqOs8Y291+wNAAN9By4LIBpmQjDsB6A6XSKh9HjWntgNBoxVQagq/cDH/Zk/JIKnuhxnbgO69MkuJ7376eATgyCgATxS+eU3pju1IPjOAzAIw5WSkEURQRilU8Kw1OappjP5/B9n80JSb9SCpIkwSJKyj/fyJwoiRn46imX/EePUxHtD9XArksyj1cXAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource adminIcon;
  private static com.google.gwt.resources.client.ImageResource myAccountIcon;
  private static com.google.gwt.resources.client.ImageResource resumeIcon;
  private static com.google.gwt.resources.client.ImageResource searchResumeIcon;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      adminIcon(), 
      myAccountIcon(), 
      resumeIcon(), 
      searchResumeIcon(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("adminIcon", adminIcon());
        resourceMap.put("myAccountIcon", myAccountIcon());
        resourceMap.put("resumeIcon", resumeIcon());
        resourceMap.put("searchResumeIcon", searchResumeIcon());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'adminIcon': return this.@lu.brainsourcing.resume.manager.client.ResumeImageBundle::adminIcon()();
      case 'myAccountIcon': return this.@lu.brainsourcing.resume.manager.client.ResumeImageBundle::myAccountIcon()();
      case 'resumeIcon': return this.@lu.brainsourcing.resume.manager.client.ResumeImageBundle::resumeIcon()();
      case 'searchResumeIcon': return this.@lu.brainsourcing.resume.manager.client.ResumeImageBundle::searchResumeIcon()();
    }
    return null;
  }-*/;
}
