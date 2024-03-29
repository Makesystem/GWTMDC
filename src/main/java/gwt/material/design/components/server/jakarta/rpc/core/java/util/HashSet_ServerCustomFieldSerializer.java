/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.material.design.components.server.jakarta.rpc.core.java.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.core.java.util.Collection_CustomFieldSerializerBase;
import gwt.material.design.components.server.jakarta.rpc.ServerCustomFieldSerializer;
import gwt.material.design.components.server.jakarta.rpc.impl.DequeMap;
import gwt.material.design.components.server.jakarta.rpc.impl.ServerSerializationStreamReader;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashSet;

/**
 * Custom field serializer for {@link java.util.HashSet}.
 */
@SuppressWarnings("rawtypes")
public final class HashSet_ServerCustomFieldSerializer extends
    ServerCustomFieldSerializer<HashSet> {

  public static void deserialize(ServerSerializationStreamReader streamReader,
      HashSet instance, Type[] expectedParameterTypes,
      DequeMap<TypeVariable<?>, Type> resolvedTypes) throws SerializationException {
    Collection_ServerCustomFieldSerializerBase.deserialize(streamReader, instance,
        expectedParameterTypes, resolvedTypes);
  }

  @Override
  public void deserializeInstance(SerializationStreamReader streamReader,
      HashSet instance) throws SerializationException {
    Collection_CustomFieldSerializerBase.deserialize(streamReader, instance);
  }

  @Override
  public void deserializeInstance(ServerSerializationStreamReader streamReader,
      HashSet instance, Type[] expectedParameterTypes,
      DequeMap<TypeVariable<?>, Type> resolvedTypes) throws SerializationException {
    deserialize(streamReader, instance, expectedParameterTypes, resolvedTypes);
  }

  @Override
  public void serializeInstance(SerializationStreamWriter streamWriter,
      HashSet instance) throws SerializationException {
    Collection_CustomFieldSerializerBase.serialize(streamWriter, instance);
  }
}
