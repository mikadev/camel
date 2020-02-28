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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.lambda.Lambda2Component;

/**
 * The aws2-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2LambdaComponentBuilderFactory {

    /**
     * AWS Lambda (camel-aws2-lambda)
     * The aws2-lambda is used for managing and invoking functions from Amazon
     * Lambda.
     * 
     * Category: cloud,computing,serverless
     * Since: 3.2
     * Maven coordinates: org.apache.camel:camel-aws2-lambda
     */
    static Aws2LambdaComponentBuilder aws2Lambda() {
        return new Aws2LambdaComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Lambda component.
     */
    interface Aws2LambdaComponentBuilder
            extends
                ComponentBuilder<Lambda2Component> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2LambdaComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2LambdaComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.lambda.Lambda2Operations</code>
         * type.
         * 
         * Default: invokeFunction
         * Group: producer
         */
        default Aws2LambdaComponentBuilder operation(
                org.apache.camel.component.aws2.lambda.Lambda2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Amazon AWS Region.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2LambdaComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2LambdaComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.lambda.LambdaClient</code>
         * type.
         * 
         * Group: advanced
         */
        default Aws2LambdaComponentBuilder awsLambdaClient(
                software.amazon.awssdk.services.lambda.LambdaClient awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Aws2LambdaComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The AWS Lambda default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.lambda.Lambda2Configuration</code> type.
         * 
         * Group: advanced
         */
        default Aws2LambdaComponentBuilder configuration(
                org.apache.camel.component.aws2.lambda.Lambda2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default Aws2LambdaComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default Aws2LambdaComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: proxy
         */
        default Aws2LambdaComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
    }

    class Aws2LambdaComponentBuilderImpl
            extends
                AbstractComponentBuilder<Lambda2Component>
            implements
                Aws2LambdaComponentBuilder {
        @Override
        protected Lambda2Component buildConcreteComponent() {
            return new Lambda2Component();
        }
        private org.apache.camel.component.aws2.lambda.Lambda2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.lambda.Lambda2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.lambda.Lambda2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": ((Lambda2Component) component).setAccessKey((java.lang.String) value); return true;
            case "lazyStartProducer": ((Lambda2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((Lambda2Component) component).setOperation((org.apache.camel.component.aws2.lambda.Lambda2Operations) value); return true;
            case "region": ((Lambda2Component) component).setRegion((java.lang.String) value); return true;
            case "secretKey": ((Lambda2Component) component).setSecretKey((java.lang.String) value); return true;
            case "awsLambdaClient": getOrCreateConfiguration((Lambda2Component) component).setAwsLambdaClient((software.amazon.awssdk.services.lambda.LambdaClient) value); return true;
            case "basicPropertyBinding": ((Lambda2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((Lambda2Component) component).setConfiguration((org.apache.camel.component.aws2.lambda.Lambda2Configuration) value); return true;
            case "proxyHost": getOrCreateConfiguration((Lambda2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Lambda2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Lambda2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            default: return false;
            }
        }
    }
}