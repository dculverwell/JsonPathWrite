/*
 * Copyright 2011 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dculverwell.jsonpathwrite.spi;

import com.github.dculverwell.jsonpathwrite.spi.impl.JsonSmartJsonProvider;

/**
 * @author Kalle Stenflo
 */
public abstract class JsonProviderFactory {

    private static JsonProvider provider = new JsonSmartJsonProvider();

    public static JsonProvider createProvider() {
        return provider;
    }

    public static synchronized void setProvider(JsonProvider jsonProvider) {
        provider = jsonProvider;
    }


}
