/**
 * Copyright 2014 www.codereligion.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codereligion.bugsnag.logback.resource;

import com.codereligion.bugsnag.logback.model.MetaDataVO;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/**
 * Custom {@link JsonSerializer} for {@link MetaDataVO}s which directly serializes the underlying data structure.
 *
 * @author Sebastian Gröbler
 */
public class MetaDataVOSerializer implements JsonSerializer<MetaDataVO> {

    @Override
    public JsonElement serialize(final MetaDataVO src, final Type typeOfSrc, final JsonSerializationContext context) {
        return context.serialize(src.getTabsByName());
    }
}
