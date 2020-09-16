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
import org.apache.camel.component.mina.MinaComponent;

/**
 * Socket level networking using TCP or UDP with Apache Mina 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MinaComponentBuilderFactory {

    /**
     * Mina (camel-mina)
     * Socket level networking using TCP or UDP with Apache Mina 2.x.
     * 
     * Category: networking,tcp,udp
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-mina
     */
    static MinaComponentBuilder mina() {
        return new MinaComponentBuilderImpl();
    }

    /**
     * Builder for the Mina component.
     */
    interface MinaComponentBuilder extends ComponentBuilder<MinaComponent> {
        /**
         * Whether or not to disconnect(close) from Mina session right after
         * use. Can be used for both consumer and producer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default MinaComponentBuilder disconnect(boolean disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * You can enable the Apache MINA logging filter. Apache MINA uses slf4j
         * logging at INFO level to log all input and output.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default MinaComponentBuilder minaLogger(boolean minaLogger) {
            doSetProperty("minaLogger", minaLogger);
            return this;
        }
        /**
         * Setting to set endpoint as one-way or request-response.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default MinaComponentBuilder sync(boolean sync) {
            doSetProperty("sync", sync);
            return this;
        }
        /**
         * You can configure the timeout that specifies how long to wait for a
         * response from a remote server. The timeout unit is in milliseconds,
         * so 60000 is 60 seconds.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 30000
         * Group: common
         */
        default MinaComponentBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Maximum amount of time it should take to send data to the MINA
         * session. Default is 10000 milliseconds.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 10000
         * Group: common
         */
        default MinaComponentBuilder writeTimeout(long writeTimeout) {
            doSetProperty("writeTimeout", writeTimeout);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default MinaComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If the clientMode is true, mina consumer will connect the address as
         * a TCP client.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default MinaComponentBuilder clientMode(boolean clientMode) {
            doSetProperty("clientMode", clientMode);
            return this;
        }
        /**
         * If sync is enabled then this option dictates MinaConsumer if it
         * should disconnect where there is no reply to send back.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer (advanced)
         */
        default MinaComponentBuilder disconnectOnNoReply(
                boolean disconnectOnNoReply) {
            doSetProperty("disconnectOnNoReply", disconnectOnNoReply);
            return this;
        }
        /**
         * If sync is enabled this option dictates MinaConsumer which logging
         * level to use when logging a there is no reply to send back.
         * 
         * The option is a: <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Default: warn
         * Group: consumer (advanced)
         */
        default MinaComponentBuilder noReplyLogLevel(
                org.apache.camel.LoggingLevel noReplyLogLevel) {
            doSetProperty("noReplyLogLevel", noReplyLogLevel);
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
        default MinaComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether to create the InetAddress once and reuse. Setting this to
         * false allows to pickup DNS changes in the network.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default MinaComponentBuilder cachedAddress(boolean cachedAddress) {
            doSetProperty("cachedAddress", cachedAddress);
            return this;
        }
        /**
         * Sessions can be lazily created to avoid exceptions, if the remote
         * server is not up and running when the Camel producer is started.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default MinaComponentBuilder lazySessionCreation(
                boolean lazySessionCreation) {
            doSetProperty("lazySessionCreation", lazySessionCreation);
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
        @Deprecated
        default MinaComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the shared mina configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mina.MinaConfiguration</code> type.
         * 
         * Group: advanced
         */
        default MinaComponentBuilder configuration(
                org.apache.camel.component.mina.MinaConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Number of worker threads in the worker pool for TCP and UDP.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 16
         * Group: advanced
         */
        default MinaComponentBuilder maximumPoolSize(int maximumPoolSize) {
            doSetProperty("maximumPoolSize", maximumPoolSize);
            return this;
        }
        /**
         * Whether to use ordered thread pool, to ensure events are processed
         * orderly on the same channel.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default MinaComponentBuilder orderedThreadPoolExecutor(
                boolean orderedThreadPoolExecutor) {
            doSetProperty("orderedThreadPoolExecutor", orderedThreadPoolExecutor);
            return this;
        }
        /**
         * Only used for TCP. You can transfer the exchange over the wire
         * instead of just the body. The following fields are transferred: In
         * body, Out body, fault body, In headers, Out headers, fault headers,
         * exchange properties, exchange exception. This requires that the
         * objects are serializable. Camel will exclude any non-serializable
         * objects and log it at WARN level.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default MinaComponentBuilder transferExchange(boolean transferExchange) {
            doSetProperty("transferExchange", transferExchange);
            return this;
        }
        /**
         * The mina component installs a default codec if both, codec is null
         * and textline is false. Setting allowDefaultCodec to false prevents
         * the mina component from installing a default codec as the first
         * element in the filter chain. This is useful in scenarios where
         * another filter must be the first in the filter chain, like the SSL
         * filter.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: codec
         */
        default MinaComponentBuilder allowDefaultCodec(boolean allowDefaultCodec) {
            doSetProperty("allowDefaultCodec", allowDefaultCodec);
            return this;
        }
        /**
         * To use a custom minda codec implementation.
         * 
         * The option is a:
         * <code>org.apache.mina.filter.codec.ProtocolCodecFactory</code> type.
         * 
         * Group: codec
         */
        default MinaComponentBuilder codec(
                org.apache.mina.filter.codec.ProtocolCodecFactory codec) {
            doSetProperty("codec", codec);
            return this;
        }
        /**
         * To set the textline protocol decoder max line length. By default the
         * default value of Mina itself is used which are 1024.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1024
         * Group: codec
         */
        default MinaComponentBuilder decoderMaxLineLength(
                int decoderMaxLineLength) {
            doSetProperty("decoderMaxLineLength", decoderMaxLineLength);
            return this;
        }
        /**
         * To set the textline protocol encoder max line length. By default the
         * default value of Mina itself is used which are Integer.MAX_VALUE.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: codec
         */
        default MinaComponentBuilder encoderMaxLineLength(
                int encoderMaxLineLength) {
            doSetProperty("encoderMaxLineLength", encoderMaxLineLength);
            return this;
        }
        /**
         * You can configure the encoding (a charset name) to use for the TCP
         * textline codec and the UDP protocol. If not provided, Camel will use
         * the JVM default Charset.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: codec
         */
        default MinaComponentBuilder encoding(java.lang.String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * You can set a list of Mina IoFilters to use.
         * 
         * The option is a:
         * <code>java.util.List<org.apache.mina.core.filterchain.IoFilter></code> type.
         * 
         * Group: codec
         */
        default MinaComponentBuilder filters(
                java.util.List<org.apache.mina.core.filterchain.IoFilter> filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Only used for TCP. If no codec is specified, you can use this flag to
         * indicate a text line based codec; if not specified or the value is
         * false, then Object Serialization is assumed over TCP.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: codec
         */
        default MinaComponentBuilder textline(boolean textline) {
            doSetProperty("textline", textline);
            return this;
        }
        /**
         * Only used for TCP and if textline=true. Sets the text line delimiter
         * to use. If none provided, Camel will use DEFAULT. This delimiter is
         * used to mark the end of text.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mina.MinaTextLineDelimiter</code>
         * type.
         * 
         * Group: codec
         */
        default MinaComponentBuilder textlineDelimiter(
                org.apache.camel.component.mina.MinaTextLineDelimiter textlineDelimiter) {
            doSetProperty("textlineDelimiter", textlineDelimiter);
            return this;
        }
        /**
         * Whether to auto start SSL handshake.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: security
         */
        default MinaComponentBuilder autoStartTls(boolean autoStartTls) {
            doSetProperty("autoStartTls", autoStartTls);
            return this;
        }
        /**
         * To configure SSL security.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default MinaComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default MinaComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class MinaComponentBuilderImpl
            extends
                AbstractComponentBuilder<MinaComponent>
            implements
                MinaComponentBuilder {
        @Override
        protected MinaComponent buildConcreteComponent() {
            return new MinaComponent();
        }
        private org.apache.camel.component.mina.MinaConfiguration getOrCreateConfiguration(
                org.apache.camel.component.mina.MinaComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.mina.MinaConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "disconnect": getOrCreateConfiguration((MinaComponent) component).setDisconnect((boolean) value); return true;
            case "minaLogger": getOrCreateConfiguration((MinaComponent) component).setMinaLogger((boolean) value); return true;
            case "sync": getOrCreateConfiguration((MinaComponent) component).setSync((boolean) value); return true;
            case "timeout": getOrCreateConfiguration((MinaComponent) component).setTimeout((long) value); return true;
            case "writeTimeout": getOrCreateConfiguration((MinaComponent) component).setWriteTimeout((long) value); return true;
            case "bridgeErrorHandler": ((MinaComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "clientMode": getOrCreateConfiguration((MinaComponent) component).setClientMode((boolean) value); return true;
            case "disconnectOnNoReply": getOrCreateConfiguration((MinaComponent) component).setDisconnectOnNoReply((boolean) value); return true;
            case "noReplyLogLevel": getOrCreateConfiguration((MinaComponent) component).setNoReplyLogLevel((org.apache.camel.LoggingLevel) value); return true;
            case "lazyStartProducer": ((MinaComponent) component).setLazyStartProducer((boolean) value); return true;
            case "cachedAddress": getOrCreateConfiguration((MinaComponent) component).setCachedAddress((boolean) value); return true;
            case "lazySessionCreation": getOrCreateConfiguration((MinaComponent) component).setLazySessionCreation((boolean) value); return true;
            case "basicPropertyBinding": ((MinaComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((MinaComponent) component).setConfiguration((org.apache.camel.component.mina.MinaConfiguration) value); return true;
            case "maximumPoolSize": getOrCreateConfiguration((MinaComponent) component).setMaximumPoolSize((int) value); return true;
            case "orderedThreadPoolExecutor": getOrCreateConfiguration((MinaComponent) component).setOrderedThreadPoolExecutor((boolean) value); return true;
            case "transferExchange": getOrCreateConfiguration((MinaComponent) component).setTransferExchange((boolean) value); return true;
            case "allowDefaultCodec": getOrCreateConfiguration((MinaComponent) component).setAllowDefaultCodec((boolean) value); return true;
            case "codec": getOrCreateConfiguration((MinaComponent) component).setCodec((org.apache.mina.filter.codec.ProtocolCodecFactory) value); return true;
            case "decoderMaxLineLength": getOrCreateConfiguration((MinaComponent) component).setDecoderMaxLineLength((int) value); return true;
            case "encoderMaxLineLength": getOrCreateConfiguration((MinaComponent) component).setEncoderMaxLineLength((int) value); return true;
            case "encoding": getOrCreateConfiguration((MinaComponent) component).setEncoding((java.lang.String) value); return true;
            case "filters": getOrCreateConfiguration((MinaComponent) component).setFilters((java.util.List) value); return true;
            case "textline": getOrCreateConfiguration((MinaComponent) component).setTextline((boolean) value); return true;
            case "textlineDelimiter": getOrCreateConfiguration((MinaComponent) component).setTextlineDelimiter((org.apache.camel.component.mina.MinaTextLineDelimiter) value); return true;
            case "autoStartTls": getOrCreateConfiguration((MinaComponent) component).setAutoStartTls((boolean) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((MinaComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((MinaComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}