package lu.brainsourcing.resume.manager.client.request;

public class ExtendedUserRequestImpl extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequestContext implements lu.brainsourcing.resume.manager.client.request.ExtendedUserRequest {
  public ExtendedUserRequestImpl(com.google.web.bindery.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory, com.google.web.bindery.requestfactory.shared.impl.AbstractRequestContext.Dialect.STANDARD);}
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.Category({com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.ValueProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.class})
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.NoWrap(com.google.web.bindery.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.web.bindery.autobean.shared.AutoBeanFactory {
    com.google.web.bindery.autobean.shared.AutoBean<lu.brainsourcing.resume.manager.shared.UserProxy> lu_brainsourcing_resume_manager_shared_UserProxy();
  }
  public static Factory FACTORY;
  @Override public Factory getAutoBeanFactory() {
    if (FACTORY == null) {
      FACTORY = com.google.gwt.core.client.GWT.create(Factory.class);
    }
    return FACTORY;
  }
  public  com.google.web.bindery.requestfactory.shared.Request<java.lang.Long> countUser() {
    class X extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.web.bindery.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(ExtendedUserRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.web.bindery.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.web.bindery.requestfactory.shared.impl.RequestData("r2IDH$NhUadb2ZAfxtMhzFk0cW4=", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.web.bindery.requestfactory.shared.Request<lu.brainsourcing.resume.manager.shared.UserProxy> findUser(final java.lang.Long id) {
    class X extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequest<lu.brainsourcing.resume.manager.shared.UserProxy> implements com.google.web.bindery.requestfactory.shared.Request<lu.brainsourcing.resume.manager.shared.UserProxy> {
      public X() { super(ExtendedUserRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.web.bindery.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.web.bindery.requestfactory.shared.impl.RequestData("cxhbY_SN1VjJ6moZPZsYRpKAUTI=", new Object[] {id}, propertyRefs, lu.brainsourcing.resume.manager.shared.UserProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
