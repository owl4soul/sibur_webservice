//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;

//@Entity
public class PutCounterpartyInfoResponseEntity extends BaseEntity {


    protected SyncResponseEntity responseSync;

    /**
     * Gets the value of the responseSync property.
     *
     * @return possible object is
     * {@link SyncResponseEntity }
     */
    public SyncResponseEntity getResponseSync() {
        return responseSync;
    }

    /**
     * Sets the value of the responseSync property.
     *
     * @param value allowed object is
     *              {@link SyncResponseEntity }
     */
    public void setResponseSync(SyncResponseEntity value) {
        this.responseSync = value;
    }

}
