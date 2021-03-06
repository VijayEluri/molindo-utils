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

import java.util.Collection;
import java.util.LinkedList;

public class LinkedPairList<K, V> extends LinkedList<Pair<K, V>> implements PairList<K, V> {

	private static final long serialVersionUID = 1L;

	public static <K, V> LinkedPairList<K, V> create() {
		return new LinkedPairList<K, V>();
	}

	public LinkedPairList() {
		super();
	}

	/**
	 * Constructs a list containing the elements of the specified collection, in
	 * the order they are returned by the collection's iterator.
	 * 
	 * @param c
	 *            the collection whose elements are to be placed into this list
	 * @throws NullPointerException
	 *             if the specified collection is null
	 */
	public LinkedPairList(final Collection<? extends Pair<K, V>> c) {
		super(c);
	}

	@Override
	public void put(final K key, final V value) {
		add(new Pair<K, V>(key, value));
	}

}
