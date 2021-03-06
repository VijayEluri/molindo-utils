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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairTest {

	@Test
	public void testKeys() {
		LinkedPairList<String, Integer> list = LinkedPairList.create();
		list.put("foo", 1);
		list.put("bar", 2);

		String[] keys = Pair.keys(String.class, list);
		Integer[] values = Pair.values(Integer.class, list);

		assertEquals(list.size(), keys.length);
		assertEquals(list.size(), values.length);

		assertArrayEquals(new String[] { "foo", "bar" }, keys);
		assertArrayEquals(new Integer[] { 1, 2 }, values);

		assertEquals(list, ArrayPairList.create(keys, values));
	}
}
