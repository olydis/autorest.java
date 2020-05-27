/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.microsoft.rest.RestClient;

/**
 * The interface for AutoRestSwaggerBATFileService class.
 */
public interface AutoRestSwaggerBATFileService {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost:3000";

    /**
     * Gets the Files object to access its operations.
     * @return the Files object.
     */
    Files files();

}
