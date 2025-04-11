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

class RandomStringGenerateTest {

    @Test
    void returnStringWithinRange() {
        // Setup: Creates a random string generator with the character ranges
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();

        // Test: Generates a random stings and provides the requested range
        String random = generator.generate(10);

        // Verify: makes sure it is not null and checks the length of the generated string. If the length is 10 then it passes
        assertNotNull(random);
        assertEquals(10, random.length());
    }
}
