package lu.brainsourcing.resume.manager.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class MainScreenService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtAccessDeniedException/2220471198", "com.gwt.ss.client.exceptions.GwtAccessDeniedException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtAccountExpiredException/458900591", "com.gwt.ss.client.exceptions.GwtAccountExpiredException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtAccountStatusException/2806551953", "com.gwt.ss.client.exceptions.GwtAccountStatusException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtAuthenticationException/1808550985", "com.gwt.ss.client.exceptions.GwtAuthenticationException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtBadCredentialsException/605123509", "com.gwt.ss.client.exceptions.GwtBadCredentialsException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtCredentialsExpiredException/4133019735", "com.gwt.ss.client.exceptions.GwtCredentialsExpiredException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtDisabledException/82460249", "com.gwt.ss.client.exceptions.GwtDisabledException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtLockedException/267853911", "com.gwt.ss.client.exceptions.GwtLockedException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtSecurityException/1451878372", "com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtSessionAuthenticationException/547718661", "com.gwt.ss.client.exceptions.GwtSessionAuthenticationException_FieldSerializer");
    result.put("com.gwt.ss.client.exceptions.GwtUsernameNotFoundException/4100388689", "com.gwt.ss.client.exceptions.GwtUsernameNotFoundException_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.util.Collections$EmptySet/3523698179", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer");
    result.put("java.util.HashSet/3273092938", "com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer");
    result.put("java.util.LinkedHashSet/1826081506", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer");
    result.put("java.util.TreeMap/1493889780", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.TreeSet/4043497002", "com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("com.gwt.ss.client.exceptions.GwtAccessDeniedException", "com.gwt.ss.client.exceptions.GwtAccessDeniedException/2220471198");
    result.put("com.gwt.ss.client.exceptions.GwtAccountExpiredException", "com.gwt.ss.client.exceptions.GwtAccountExpiredException/458900591");
    result.put("com.gwt.ss.client.exceptions.GwtAccountStatusException", "com.gwt.ss.client.exceptions.GwtAccountStatusException/2806551953");
    result.put("com.gwt.ss.client.exceptions.GwtAuthenticationException", "com.gwt.ss.client.exceptions.GwtAuthenticationException/1808550985");
    result.put("com.gwt.ss.client.exceptions.GwtBadCredentialsException", "com.gwt.ss.client.exceptions.GwtBadCredentialsException/605123509");
    result.put("com.gwt.ss.client.exceptions.GwtCredentialsExpiredException", "com.gwt.ss.client.exceptions.GwtCredentialsExpiredException/4133019735");
    result.put("com.gwt.ss.client.exceptions.GwtDisabledException", "com.gwt.ss.client.exceptions.GwtDisabledException/82460249");
    result.put("com.gwt.ss.client.exceptions.GwtLockedException", "com.gwt.ss.client.exceptions.GwtLockedException/267853911");
    result.put("com.gwt.ss.client.exceptions.GwtSecurityException", "com.gwt.ss.client.exceptions.GwtSecurityException/1451878372");
    result.put("com.gwt.ss.client.exceptions.GwtSessionAuthenticationException", "com.gwt.ss.client.exceptions.GwtSessionAuthenticationException/547718661");
    result.put("com.gwt.ss.client.exceptions.GwtUsernameNotFoundException", "com.gwt.ss.client.exceptions.GwtUsernameNotFoundException/4100388689");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3523698179");
    result.put("java.util.HashSet", "java.util.HashSet/3273092938");
    result.put("java.util.LinkedHashSet", "java.util.LinkedHashSet/1826081506");
    result.put("java.util.TreeMap", "java.util.TreeMap/1493889780");
    result.put("java.util.TreeSet", "java.util.TreeSet/4043497002");
    return result;
  }
  
  public MainScreenService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
