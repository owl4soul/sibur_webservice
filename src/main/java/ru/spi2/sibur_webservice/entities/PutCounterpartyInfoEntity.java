//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;

import java.math.BigDecimal;

//@Entity
public class PutCounterpartyInfoEntity extends BaseEntity {

    protected HeaderEntity headerEntity;

    protected BigDecimal registrationRegrequestId;

    protected CounterpartyEntity counterpartyEntity;

    protected CounterpartySapIdentitiesEntity counterpartySapIdentitiesEntity;

    /**
     * Gets the value of the headerEntity property.
     *
     * @return possible object is
     * {@link HeaderEntity }
     */
    public HeaderEntity getHeaderEntity() {
        return headerEntity;
    }

    /**
     * Sets the value of the headerEntity property.
     *
     * @param value allowed object is
     *              {@link HeaderEntity }
     */
    public void setHeaderEntity(HeaderEntity value) {
        this.headerEntity = value;
    }

    /**
     * Gets the value of the registrationRegrequestId property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getRegistrationRegrequestId() {
        return registrationRegrequestId;
    }

    /**
     * Sets the value of the registrationRegrequestId property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setRegistrationRegrequestId(BigDecimal value) {
        this.registrationRegrequestId = value;
    }

    /**
     * Gets the value of the counterpartyEntity property.
     *
     * @return possible object is
     * {@link CounterpartyEntity }
     */
    public CounterpartyEntity getCounterpartyEntity() {
        return counterpartyEntity;
    }

    /**
     * Sets the value of the counterpartyEntity property.
     *
     * @param value allowed object is
     *              {@link CounterpartyEntity }
     */
    public void setCounterpartyEntity(CounterpartyEntity value) {
        this.counterpartyEntity = value;
    }

    /**
     * Gets the value of the counterpartySapIdentitiesEntity property.
     *
     * @return possible object is
     * {@link CounterpartySapIdentitiesEntity }
     */
    public CounterpartySapIdentitiesEntity getCounterpartySapIdentitiesEntity() {
        return counterpartySapIdentitiesEntity;
    }

    /**
     * Sets the value of the counterpartySapIdentitiesEntity property.
     *
     * @param value allowed object is
     *              {@link CounterpartySapIdentitiesEntity }
     */
    public void setCounterpartySapIdentitiesEntity(CounterpartySapIdentitiesEntity value) {
        this.counterpartySapIdentitiesEntity = value;
    }

}