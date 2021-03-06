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

package org.kie.cloud.optaweb;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Ignore;
import org.junit.Test;
import org.kie.cloud.api.DeploymentScenarioBuilderFactory;
import org.kie.cloud.api.scenario.EmployeeRosteringScenario;
import org.kie.cloud.tests.common.AbstractMethodIsolatedCloudIntegrationTest;

public class OptawebEmployeeRosteringIntegrationTest extends AbstractMethodIsolatedCloudIntegrationTest<EmployeeRosteringScenario> {

    @Override
    protected EmployeeRosteringScenario createDeploymentScenario(DeploymentScenarioBuilderFactory deploymentScenarioFactory) {
        return deploymentScenarioFactory.getEmployeeRosteringScenarioBuilder().build();
    }

    @Test
    @Ignore("Requires a complete rewrite after Employee Rostering has been re-implemented in React and Spring Boot")
    public void fromSkillToRoster() {
        throw new UnsupportedOperationException();
    }

    private URL getSanitizedUrl() {
        URL appUrl = deploymentScenario.getEmployeeRosteringDeployment().getUrl();
        String appUrlString = appUrl.toExternalForm();
        String sanitizedAppUrl = appUrlString.endsWith("/") ? appUrlString : appUrlString + "/";
        try {
            return new URL(sanitizedAppUrl);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid Optaweb Employee Rostering application URL.", e);
        }
    }
}
