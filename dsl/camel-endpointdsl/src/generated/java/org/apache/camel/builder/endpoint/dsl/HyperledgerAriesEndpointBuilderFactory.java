/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Camel support for Hyperledger Aries
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HyperledgerAriesEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hyperledger Aries component.
     */
    public interface HyperledgerAriesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHyperledgerAriesEndpointBuilder advanced() {
            return (AdvancedHyperledgerAriesEndpointBuilder) this;
        }
        /**
         * Allow on-demand schema creation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoSchema the value to set
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder autoSchema(boolean autoSchema) {
            doSetProperty("autoSchema", autoSchema);
            return this;
        }
        /**
         * Allow on-demand schema creation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoSchema the value to set
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder autoSchema(String autoSchema) {
            doSetProperty("autoSchema", autoSchema);
            return this;
        }
        /**
         * A schema name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param schemaName the value to set
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder schemaName(String schemaName) {
            doSetProperty("schemaName", schemaName);
            return this;
        }
        /**
         * A schema version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param schemaVersion the value to set
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder schemaVersion(
                String schemaVersion) {
            doSetProperty("schemaVersion", schemaVersion);
            return this;
        }
        /**
         * An API path (e.g. /issue-credential/records).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param service the value to set
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder service(String service) {
            doSetProperty("service", service);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hyperledger Aries component.
     */
    public interface AdvancedHyperledgerAriesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default HyperledgerAriesEndpointBuilder basic() {
            return (HyperledgerAriesEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHyperledgerAriesEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHyperledgerAriesEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface HyperledgerAriesBuilders {
        /**
         * Hyperledger Aries (camel-hyperledger-aries)
         * Camel support for Hyperledger Aries
         * 
         * Category: blockchain,identity
         * Since: 3.19
         * Maven coordinates: org.apache.camel:camel-hyperledger-aries
         * 
         * Syntax: <code>hyperledger-aries:walletName</code>
         * 
         * Path parameter: walletName (required)
         * The wallet to connect to
         * 
         * @param path walletName
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder hyperledgerAries(String path) {
            return HyperledgerAriesEndpointBuilderFactory.endpointBuilder("hyperledger-aries", path);
        }
        /**
         * Hyperledger Aries (camel-hyperledger-aries)
         * Camel support for Hyperledger Aries
         * 
         * Category: blockchain,identity
         * Since: 3.19
         * Maven coordinates: org.apache.camel:camel-hyperledger-aries
         * 
         * Syntax: <code>hyperledger-aries:walletName</code>
         * 
         * Path parameter: walletName (required)
         * The wallet to connect to
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path walletName
         * @return the dsl builder
         */
        default HyperledgerAriesEndpointBuilder hyperledgerAries(
                String componentName,
                String path) {
            return HyperledgerAriesEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static HyperledgerAriesEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HyperledgerAriesEndpointBuilderImpl extends AbstractEndpointBuilder implements HyperledgerAriesEndpointBuilder, AdvancedHyperledgerAriesEndpointBuilder {
            public HyperledgerAriesEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HyperledgerAriesEndpointBuilderImpl(path);
    }
}