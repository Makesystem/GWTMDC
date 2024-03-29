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
import gwt.material.design.components.server.jakarta.rpc.impl.DequeMap;
import gwt.material.design.components.server.jakarta.rpc.impl.ServerSerializationStreamReader;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/**
 * Custom field serializer for {@link java.util.Collection}, used by
 * implementing classes.
 */
public final class Collection_ServerCustomFieldSerializerBase {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void deserialize(ServerSerializationStreamReader streamReader, Collection instance,
      Type[] expectedParameterTypes, DequeMap<TypeVariable<?>, Type> resolvedTypes) throws
      SerializationException {
    int size = streamReader.readInt();
    for (int i = 0; i < size; ++i) {
      Object obj = streamReader.readObject(expectedParameterTypes[0], resolvedTypes);
      instance.add(obj);
    }
  }
}
