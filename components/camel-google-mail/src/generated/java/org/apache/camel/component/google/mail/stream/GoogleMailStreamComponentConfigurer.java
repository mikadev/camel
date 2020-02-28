/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.mail.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleMailStreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration getOrCreateConfiguration(GoogleMailStreamComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleMailStreamComponent target = (GoogleMailStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "labels": getOrCreateConfiguration(target).setLabels(property(camelContext, java.lang.String.class, value)); return true;
        case "markasread":
        case "markAsRead": getOrCreateConfiguration(target).setMarkAsRead(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, long.class, value)); return true;
        case "query": getOrCreateConfiguration(target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.mail.GoogleMailClientFactory.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration.class, value)); return true;
        default: return false;
        }
    }

}
