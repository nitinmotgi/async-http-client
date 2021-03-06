/*
 * Copyright (c) 2012-2013 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

package com.ning.http.client.providers.grizzly;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.async.ProxyTunnellingTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class GrizzlyProxyTunnelingTest extends ProxyTunnellingTest {

    @Override
    public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
        if (config == null) {
            config = new AsyncHttpClientConfig.Builder().build();
        }
        return new AsyncHttpClient(new GrizzlyAsyncHttpProvider(config), config);
    }

    @Test(enabled=false)
    @Override
    public void testRequestProxy() throws IOException, InterruptedException, ExecutionException, TimeoutException {
        super.testRequestProxy();
    }

    @Test(enabled=false)
    @Override
    public void testConfigProxy() throws IOException, InterruptedException, ExecutionException, TimeoutException {
        super.testConfigProxy();
    }

    @Test(enabled=false)
    @Override
    public void testSimpleAHCConfigProxy() throws IOException, InterruptedException, ExecutionException, TimeoutException {
        super.testSimpleAHCConfigProxy();
    }
}
