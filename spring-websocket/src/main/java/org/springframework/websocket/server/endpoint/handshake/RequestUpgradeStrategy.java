/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.websocket.server.endpoint.handshake;

import javax.websocket.Endpoint;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;


/**
 * A strategy for performing the container-specific steps for upgrading an HTTP request
 * as part of a WebSocket handshake.
 *
 * @author Rossen Stoyanchev
 * @since 4.0
 */
public interface RequestUpgradeStrategy {

	String[] getSupportedVersions();

	/**
	 * Invoked after the handshake checks have been performed and succeeded.
	 */
	void upgrade(ServerHttpRequest request, ServerHttpResponse response, String protocol, Endpoint endpoint)
			throws Exception;

}