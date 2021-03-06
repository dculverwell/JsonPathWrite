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

import java.util.Collection;

/**
 * @author Kalle Stenflo
 */
public interface MappingProvider {


    public <T> T convertValue(Object fromValue, Class<T> toValueType) throws IllegalArgumentException;

    public <T extends Collection<E>, E> T convertValue(Object fromValue, Class<T> collectionType, Class<E> elementType) throws IllegalArgumentException;

}
