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
package org.apache.camel.language.xquery;

import org.apache.camel.CamelContext;
import org.apache.camel.Expression;
import org.apache.camel.Predicate;
import org.apache.camel.component.xquery.XQueryBuilder;
import org.apache.camel.spi.PropertyConfigurer;
import org.apache.camel.spi.annotations.Language;
import org.apache.camel.support.LanguageSupport;
import org.apache.camel.support.component.PropertyConfigurerSupport;

@Language("xquery")
public class XQueryLanguage extends LanguageSupport implements PropertyConfigurer {

    private Class<?> resultType;
    private String headerName;

    public Class<?> getResultType() {
        return resultType;
    }

    public void setResultType(Class<?> resultType) {
        this.resultType = resultType;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    @Override
    public Predicate createPredicate(String expression) {
        expression = loadResource(expression);

        XQueryBuilder builder = XQueryBuilder.xquery(expression);
        configureBuilder(builder);
        return builder;
    }

    @Override
    public Expression createExpression(String expression) {
        expression = loadResource(expression);

        XQueryBuilder builder = XQueryBuilder.xquery(expression);
        configureBuilder(builder);
        return builder;
    }

    @Override
    public Predicate createPredicate(String expression, Object[] properties) {
        return (Predicate) createExpression(expression, properties);
    }

    @Override
    public Expression createExpression(String expression, Object[] properties) {
        expression = loadResource(expression);

        Class<?> clazz = property(Class.class, properties, 0, null);
        if (clazz != null) {
            setResultType(clazz);
        }
        setHeaderName(property(String.class, properties, 1, headerName));

        XQueryBuilder builder = XQueryBuilder.xquery(expression);
        configureBuilder(builder);
        return builder;
    }

    protected void configureBuilder(XQueryBuilder builder) {
        if (resultType != null) {
            builder.setResultType(resultType);
        }
        if (headerName != null) {
            builder.setHeaderName(headerName);
        }
    }

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (target != this) {
            throw new IllegalStateException("Can only configure our own instance !");
        }
        switch (ignoreCase ? name.toLowerCase() : name) {
            case "resulttype":
            case "resultType":
                setResultType(PropertyConfigurerSupport.property(camelContext, Class.class, value));
                return true;
            case "headername":
            case "headerName":
                setHeaderName(PropertyConfigurerSupport.property(camelContext, String.class, value));
                return true;
            default:
                return false;
        }
    }

}
