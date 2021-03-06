/*
 * Copyright 2017 Jiupeng Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeager.ecom.util.springfox;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import springfox.documentation.swagger.web.SecurityConfiguration;

import java.lang.reflect.Type;

/**
 * @author Indra Basak
 * @since 11/23/2017
 */
public class SpringfoxSecurityConfigurationJsonAdaptor
        implements JsonSerializer<SecurityConfiguration> {

    @Override
    public JsonElement serialize(SecurityConfiguration config, Type type, JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("clientId", config.getClientId());
        jsonObject.addProperty("realm", config.getRealm());
        jsonObject.addProperty("appName", config.getAppName());
        jsonObject.addProperty("apiKey", config.getApiKey());
        jsonObject.addProperty("apiKeyName", config.getApiKeyName());
        jsonObject.addProperty("clientSecret", config.getClientSecret());
        jsonObject.addProperty("scopeSeparator", config.scopeSeparator());
        jsonObject.addProperty("apiKeyVehicle", config.getApiKeyVehicle());

        return jsonObject;
    }
}