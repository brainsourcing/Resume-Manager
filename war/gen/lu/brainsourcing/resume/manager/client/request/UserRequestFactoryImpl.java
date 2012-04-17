package lu.brainsourcing.resume.manager.client.request;

public class UserRequestFactoryImpl extends com.google.web.bindery.requestfactory.gwt.client.impl.AbstractClientRequestFactory implements lu.brainsourcing.resume.manager.client.request.UserRequestFactory {
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.Category({com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.ValueProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.class})
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.NoWrap(com.google.web.bindery.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.web.bindery.autobean.shared.AutoBeanFactory {
    com.google.web.bindery.autobean.shared.AutoBean<com.google.web.bindery.requestfactory.shared.EntityProxy> com_google_web_bindery_requestfactory_shared_EntityProxy();
    com.google.web.bindery.autobean.shared.AutoBean<lu.brainsourcing.resume.manager.shared.UserProxy> lu_brainsourcing_resume_manager_shared_UserProxy();
  }
  public static Factory FACTORY;
  @Override public Factory getAutoBeanFactory() {
    if (FACTORY == null) {
      FACTORY = com.google.gwt.core.client.GWT.create(Factory.class);
    }
    return FACTORY;
  }
  public lu.brainsourcing.resume.manager.client.request.ExtendedUserRequestImpl getUserRequest() {
    return new lu.brainsourcing.resume.manager.client.request.ExtendedUserRequestImpl(this);
  }
  private static final java.util.HashMap<String, Class<?>> tokensToTypes = new java.util.HashMap<String, Class<?>>();
  private static final java.util.HashMap<Class<?>, String> typesToTokens = new java.util.HashMap<Class<?>, String>();
  private static final java.util.HashSet<Class<?>> entityProxyTypes = new java.util.HashSet<Class<?>>();
  private static final java.util.HashSet<Class<?>> valueProxyTypes = new java.util.HashSet<Class<?>>();
  static {
    tokensToTypes.put("w1Qg$YHpDaNcHrR5HZ$23y518nA=", com.google.web.bindery.requestfactory.shared.EntityProxy.class);
    typesToTokens.put(com.google.web.bindery.requestfactory.shared.EntityProxy.class, "w1Qg$YHpDaNcHrR5HZ$23y518nA=");
    entityProxyTypes.add(com.google.web.bindery.requestfactory.shared.EntityProxy.class);
    tokensToTypes.put("EB0dr3185cmvOCjR72UmwsJeP2g=", lu.brainsourcing.resume.manager.shared.UserProxy.class);
    typesToTokens.put(lu.brainsourcing.resume.manager.shared.UserProxy.class, "EB0dr3185cmvOCjR72UmwsJeP2g=");
    entityProxyTypes.add(lu.brainsourcing.resume.manager.shared.UserProxy.class);
  }
  @Override public String getFactoryTypeToken() {
    return "lu.brainsourcing.resume.manager.client.request.UserRequestFactory";
  }
  @Override protected Class getTypeFromToken(String typeToken) {
    return tokensToTypes.get(typeToken);
  }
  @Override protected String getTypeToken(Class type) {
    return typesToTokens.get(type);
  }
  @Override public boolean isEntityType(Class<?> type) {
    return entityProxyTypes.contains(type);
  }
  @Override public boolean isValueType(Class<?> type) {
    return valueProxyTypes.contains(type);
  }
}
