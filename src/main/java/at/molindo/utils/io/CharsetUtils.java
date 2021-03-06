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

package at.molindo.utils.io;

import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;

public final class CharsetUtils {

	public static final String US_ASCII_NAME = "US-ASCII";
	public static final String ISO_8859_1_NAME = "ISO-8859-1";
	public static final String UTF_8_NAME = "UTF-8";
	public static final String UTF_16_NAME = "UTF-16";
	public static final String UTF_16LE_NAME = "UTF-16LE";
	public static final String UTF_16BE_NAME = "UTF-16BE";

	public static final Charset US_ASCII = Charset.forName(US_ASCII_NAME);
	public static final Charset ISO_8859_1 = Charset.forName(ISO_8859_1_NAME);
	public static final Charset UTF_8 = Charset.forName(UTF_8_NAME);
	public static final Charset UTF_16 = Charset.forName(UTF_16_NAME);
	public static final Charset UTF_16LE = Charset.forName(UTF_16LE_NAME);
	public static final Charset UTF_16BE = Charset.forName(UTF_16BE_NAME);

	private CharsetUtils() {

	}

	public static boolean is(final String str, Charset charset) {
		try {
			charset.newEncoder().onMalformedInput(CodingErrorAction.REPORT)
					.onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str));
			return true;
		} catch (UnmappableCharacterException e) {
			return false;
		} catch (MalformedInputException e) {
			return false;
		} catch (CharacterCodingException e) {
			return false;
		}
	}

}
