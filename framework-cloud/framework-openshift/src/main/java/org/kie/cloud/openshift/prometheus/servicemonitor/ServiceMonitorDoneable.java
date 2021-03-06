/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.cloud.openshift.prometheus.servicemonitor;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

/**
 * Custom resource functions used by Fabric8 OpenShift client.
 */
public class ServiceMonitorDoneable extends CustomResourceDoneable<ServiceMonitor> {

    public ServiceMonitorDoneable(ServiceMonitor resource, Function<ServiceMonitor, ServiceMonitor> function) {
        super(resource, function);
    }

}
