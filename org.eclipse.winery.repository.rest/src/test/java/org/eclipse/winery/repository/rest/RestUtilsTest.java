/*******************************************************************************
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
package org.eclipse.winery.repository.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestUtilsTest {

    @Test
    public void testCreateID() {
        assertEquals("Frank-s-test", RestUtils.createXMLid("Frank's test").getDecoded());
        assertEquals("MyNodeType", RestUtils.createXMLid("MyNodeType").getDecoded());
        assertEquals("A-Node-Type", RestUtils.createXMLid("A Node Type").getDecoded());
    }
}
