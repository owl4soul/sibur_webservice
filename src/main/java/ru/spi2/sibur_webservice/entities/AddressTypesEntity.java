//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;

public enum AddressTypesEntity {

    LEGALADDR,
    POSTADDR,
    ACTUAL;

    public String value() {
        return name();
    }

    public static AddressTypesEntity fromValue(String v) {
        return valueOf(v);
    }

}
