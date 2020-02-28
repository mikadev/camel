/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.smpp;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SmppComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.smpp.SmppConfiguration getOrCreateConfiguration(SmppComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.smpp.SmppConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SmppComponent target = (SmppComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "initialreconnectdelay":
        case "initialReconnectDelay": getOrCreateConfiguration(target).setInitialReconnectDelay(property(camelContext, long.class, value)); return true;
        case "maxreconnect":
        case "maxReconnect": getOrCreateConfiguration(target).setMaxReconnect(property(camelContext, int.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": getOrCreateConfiguration(target).setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "splittingpolicy":
        case "splittingPolicy": getOrCreateConfiguration(target).setSplittingPolicy(property(camelContext, org.apache.camel.component.smpp.SmppSplittingPolicy.class, value)); return true;
        case "systemtype":
        case "systemType": getOrCreateConfiguration(target).setSystemType(property(camelContext, java.lang.String.class, value)); return true;
        case "addressrange":
        case "addressRange": getOrCreateConfiguration(target).setAddressRange(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "destaddr":
        case "destAddr": getOrCreateConfiguration(target).setDestAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "destaddrnpi":
        case "destAddrNpi": getOrCreateConfiguration(target).setDestAddrNpi(property(camelContext, byte.class, value)); return true;
        case "destaddrton":
        case "destAddrTon": getOrCreateConfiguration(target).setDestAddrTon(property(camelContext, byte.class, value)); return true;
        case "lazysessioncreation":
        case "lazySessionCreation": getOrCreateConfiguration(target).setLazySessionCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "numberingplanindicator":
        case "numberingPlanIndicator": getOrCreateConfiguration(target).setNumberingPlanIndicator(property(camelContext, byte.class, value)); return true;
        case "priorityflag":
        case "priorityFlag": getOrCreateConfiguration(target).setPriorityFlag(property(camelContext, byte.class, value)); return true;
        case "protocolid":
        case "protocolId": getOrCreateConfiguration(target).setProtocolId(property(camelContext, byte.class, value)); return true;
        case "registereddelivery":
        case "registeredDelivery": getOrCreateConfiguration(target).setRegisteredDelivery(property(camelContext, byte.class, value)); return true;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": getOrCreateConfiguration(target).setReplaceIfPresentFlag(property(camelContext, byte.class, value)); return true;
        case "servicetype":
        case "serviceType": getOrCreateConfiguration(target).setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceaddr":
        case "sourceAddr": getOrCreateConfiguration(target).setSourceAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceaddrnpi":
        case "sourceAddrNpi": getOrCreateConfiguration(target).setSourceAddrNpi(property(camelContext, byte.class, value)); return true;
        case "sourceaddrton":
        case "sourceAddrTon": getOrCreateConfiguration(target).setSourceAddrTon(property(camelContext, byte.class, value)); return true;
        case "typeofnumber":
        case "typeOfNumber": getOrCreateConfiguration(target).setTypeOfNumber(property(camelContext, byte.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.smpp.SmppConfiguration.class, value)); return true;
        case "enquirelinktimer":
        case "enquireLinkTimer": getOrCreateConfiguration(target).setEnquireLinkTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sessionstatelistener":
        case "sessionStateListener": getOrCreateConfiguration(target).setSessionStateListener(property(camelContext, org.jsmpp.session.SessionStateListener.class, value)); return true;
        case "transactiontimer":
        case "transactionTimer": getOrCreateConfiguration(target).setTransactionTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "alphabet": getOrCreateConfiguration(target).setAlphabet(property(camelContext, byte.class, value)); return true;
        case "datacoding":
        case "dataCoding": getOrCreateConfiguration(target).setDataCoding(property(camelContext, byte.class, value)); return true;
        case "encoding": getOrCreateConfiguration(target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": getOrCreateConfiguration(target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": getOrCreateConfiguration(target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": getOrCreateConfiguration(target).setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": getOrCreateConfiguration(target).setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyheaders":
        case "proxyHeaders": getOrCreateConfiguration(target).setProxyHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "systemid":
        case "systemId": getOrCreateConfiguration(target).setSystemId(property(camelContext, java.lang.String.class, value)); return true;
        case "usingssl":
        case "usingSSL": getOrCreateConfiguration(target).setUsingSSL(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
