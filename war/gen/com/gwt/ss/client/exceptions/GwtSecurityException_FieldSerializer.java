package com.gwt.ss.client.exceptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GwtSecurityException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwt.ss.client.exceptions.GwtSecurityException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwt.ss.client.exceptions.GwtSecurityException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwt.ss.client.exceptions.GwtSecurityException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwt.ss.client.exceptions.GwtSecurityException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer.deserialize(reader, (com.gwt.ss.client.exceptions.GwtSecurityException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwt.ss.client.exceptions.GwtSecurityException_FieldSerializer.serialize(writer, (com.gwt.ss.client.exceptions.GwtSecurityException)object);
  }
  
}
