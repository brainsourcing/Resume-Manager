package com.gwt.ss.client.exceptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GwtSessionAuthenticationException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwt.ss.client.exceptions.GwtSessionAuthenticationException instance) throws SerializationException {
    
    com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwt.ss.client.exceptions.GwtSessionAuthenticationException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwt.ss.client.exceptions.GwtSessionAuthenticationException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwt.ss.client.exceptions.GwtSessionAuthenticationException instance) throws SerializationException {
    
    com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwt.ss.client.exceptions.GwtSessionAuthenticationException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwt.ss.client.exceptions.GwtSessionAuthenticationException_FieldSerializer.deserialize(reader, (com.gwt.ss.client.exceptions.GwtSessionAuthenticationException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwt.ss.client.exceptions.GwtSessionAuthenticationException_FieldSerializer.serialize(writer, (com.gwt.ss.client.exceptions.GwtSessionAuthenticationException)object);
  }
  
}
