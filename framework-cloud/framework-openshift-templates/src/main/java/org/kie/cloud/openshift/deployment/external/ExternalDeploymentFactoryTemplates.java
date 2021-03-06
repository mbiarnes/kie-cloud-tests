/*
 * Copyright 2019 JBoss by Red Hat.
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
package org.kie.cloud.openshift.deployment.external;

import java.util.Map;

import org.kie.cloud.api.deployment.Deployment;
import org.kie.cloud.openshift.deployment.external.ExternalDeployment.ExternalDeploymentID;

public class ExternalDeploymentFactoryTemplates implements ExternalDeploymentFactory {

    @Override
    public ExternalDeployment<? extends Deployment, ?> get(ExternalDeploymentID id, Map<String, String> extraDeploymentConfig) {
        switch (id) {
            case LDAP:
                return new LdapExternalDeploymentTemplates(extraDeploymentConfig);
            case MAVEN_REPOSITORY:
                return new MavenRepositoryExternalDeploymentTemplates(extraDeploymentConfig);
            default:
                throw new RuntimeException("Unknown extra scenario deployment: " + id);
        }
    }
}
