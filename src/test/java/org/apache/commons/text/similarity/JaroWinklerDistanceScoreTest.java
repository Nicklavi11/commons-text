/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.text.similarity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JaroWinklerDistanceScoreTest {

    private static JaroWinklerDistance distance;

    @BeforeAll
    public static void setUp() {
        distance = new JaroWinklerDistance();
    }

    //min: looking for a 0.0
    @Test
    void perfectMatchTest() {
        assertEquals(0.0, distance.apply("hello", "hello"));
    }

    //min+1: looking for a value greater than 0.0 but less than 0.1
    @Test
    void slightlyPerfectMatchTest() {
        double actual = distance.apply("hello", "hello!");
        assertTrue(actual > 0.0 && actual < 0.1);
    }

    //typical: looking for a value greater than 0.1 and less than 0.5
    @Test
    void mediumMatchTest() {
        double actual = distance.apply("hello", "help");
        assertTrue(actual > 0.1 && actual < 0.5);
    }

    //max-1: looking for a value greater than 0.5 and less than 1.0
    @Test
    void slightlyCompletelyDifferentMatchTest() {
        double actual = distance.apply("hello", "world");
        assertTrue(actual > 0.5 && actual < 1.0);

    }

    //max: looking for a 1.0
    @Test
    void completeDifferentMatchTest() {
        assertEquals(1.0, distance.apply("hello", "nope"));
    }
}
