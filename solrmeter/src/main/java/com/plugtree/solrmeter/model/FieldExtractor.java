/**
 * Copyright Plugtree LLC
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
package com.plugtree.solrmeter.model;

import java.util.List;

public interface FieldExtractor {

	/**
	 * @return The list of all fields of schema
	 */
	List<String> getFields();
	
	/**
	 * @return The list of all fields that can be used for faceting
	 */
	List<String> getFacetFields();
	
	/**
	 * @return One random field that can be used for faceting
	 */
	String getRandomFacetField();
	
}
