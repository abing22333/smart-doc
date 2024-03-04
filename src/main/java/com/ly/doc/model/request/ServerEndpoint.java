/*
 * Copyright (C) 2018-2024 smart-doc
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.ly.doc.model.request;

import java.util.Collections;
import java.util.List;

/**
 * the annotation of ServerEndpoint
 *
 * @author linwumingshi
 */
public class ServerEndpoint {

    /**
     * The URI or URI-template that the annotated class should be mapped to.
     */
    private String url;

    /**
     * the subProtocol list of annotation
     */
    private List<String> subProtocols;

    public ServerEndpoint() {
        this.subProtocols = Collections.emptyList();
    }


    /**
     * builder ServerEndpoint
     *
     * @return ServerEndpoint
     */
    public static ServerEndpoint builder() {
        return new ServerEndpoint();
    }


    public String getUrl() {
        return url;
    }

    public List<String> getSubProtocols() {
        return subProtocols;
    }

    public ServerEndpoint setUrl(String url) {
        this.url = url;
        return this;
    }

    public ServerEndpoint setSubProtocols(List<String> subProtocols) {
        this.subProtocols = subProtocols;
        return this;
    }

}
