/*
 * Copyright 2015 Gualtiero Testa <www.gualtierotesta.it>.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A very simple class
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
public class AClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(AClass.class);

    public AClass() {
        LOGGER.debug("Constructor invoked");
    }

    public String aMethod(int value) {
        LOGGER.info("Invoked method with argument {}", value);
        return "The value is " + value;
    }
}
