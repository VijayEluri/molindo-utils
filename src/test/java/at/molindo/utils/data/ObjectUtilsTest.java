/**
 * Copyright 2010 Molindo GmbH
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
package at.molindo.utils.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ObjectUtilsTest {

	@Test
	public void testEquals() {
		assertTrue(ObjectUtils.equals(null, null));
		assertFalse(ObjectUtils.equals("foo", null));
		assertFalse(ObjectUtils.equals(null, "bar"));
		assertFalse(ObjectUtils.equals("foo", "bar"));
		assertTrue(ObjectUtils.equals("foo", "foo"));
	}
}
