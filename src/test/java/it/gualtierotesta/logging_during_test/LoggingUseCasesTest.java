/*
 * Copyright 2015 Gualtiero Testa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.gualtierotesta.logging_during_test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test
 *
 * @author gualtiero
 */
public class LoggingUseCasesTest {

    /**
     * Test of case1UnexpectedException method, of class LoggingUseCases.
     */
    @Test
    public void testCase1UnexpectedException() {
        // given
        String condition = "age<25";
        LoggingUseCases sut = new LoggingUseCases();
        // when
        sut.case1UnexpectedException(condition);
        // then
        Assert.assertTrue(true);
    }

}
