/*******************************************************************************
 * Copyright (c) 2017-2018 Contributors to the Eclipse Foundation
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
package org.eclipse.winery.repository.importing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.winery.common.ids.definitions.ServiceTemplateId;
import org.eclipse.winery.accountability.model.ProvenanceVerification;

public class ImportMetaInformation {

    public final List<String> errors;
    public ServiceTemplateId entryServiceTemplate;
    public Map<String, ProvenanceVerification> verificationMap;
    public boolean valid;

    public ImportMetaInformation() {
        this.errors = new ArrayList<>();
    }
}
