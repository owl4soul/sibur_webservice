//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;

import javax.validation.constraints.Size;

//@Entity
public class PutContractStatusEntity extends BaseEntity {

    protected HeaderEntity headerEntity;

    @Size(max = 50)
    protected String contractId;

    @Size(max = 50)
    protected String approvalStage;

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
     * Gets the value of the contractId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the approvalStage property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApprovalStage() {
        return approvalStage;
    }

    /**
     * Sets the value of the approvalStage property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApprovalStage(String value) {
        this.approvalStage = value;
    }

}
