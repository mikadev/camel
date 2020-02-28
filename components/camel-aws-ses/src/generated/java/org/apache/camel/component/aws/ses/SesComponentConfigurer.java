/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ses;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SesComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.aws.ses.SesConfiguration getOrCreateConfiguration(SesComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.ses.SesConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SesComponent target = (SesComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsesclient":
        case "amazonSESClient": getOrCreateConfiguration(target).setAmazonSESClient(property(camelContext, com.amazonaws.services.simpleemail.AmazonSimpleEmailService.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoaddresses":
        case "replyToAddresses": getOrCreateConfiguration(target).setReplyToAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "returnpath":
        case "returnPath": getOrCreateConfiguration(target).setReturnPath(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "to": getOrCreateConfiguration(target).setTo(property(camelContext, java.util.List.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.ses.SesConfiguration.class, value)); return true;
        default: return false;
        }
    }

}
