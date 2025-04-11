/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.text;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeTest {
    // Equivalence Partition Case 1: Empty String
    @Test
    void testEmptyString() {
        assertEquals("", WordUtils.capitalize(""));
    }

    // Equivalence Partition Case 2: Single lowercase word
    @Test
    void testSingleLowercaseWord() {
        assertEquals("Hello", WordUtils.capitalize("hello"));
    }

    // Equivalence Partition Case 3: Single all uppercase word
    @Test
    void testSingleUppercaseWord() {
        assertEquals("HELLO", WordUtils.capitalize("HELLO"));
    }

    // Equivalence Partition Case 4: Multiple lowercase words
    @Test
    void testMultipleLowercaseWords() {
        assertEquals("Hello World", WordUtils.capitalize("hello world"));
    }

    // Equivalence Partition Case 5: Whitespace around words
    @Test
    void testWhitespaceAroundWord() {
        assertEquals("   Hello World   ", WordUtils.capitalize("   hello world   "));
    }

    // Equivalence Partition Case 6: Mixed uppercase and lowercase words
    @Test
    void testMixedWord() {
        assertEquals("HELlO WOrLd", WordUtils.capitalize("hELlO wOrLd"));
    }

    // Equivalence Partition Case 7: Word with number
    @Test
    void testNumberWithWord() {
        assertEquals("Hello 123", WordUtils.capitalize("hello 123"));
    }

    // Equivalence Partition Case 8: Null input
    @Test
    void testNullWord() {
        assertNull(WordUtils.capitalize(null));
    }
}

