
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutContractStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutContractStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvalStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutContractStatus", propOrder = {
    "header",
    "contractId",
    "approvalStage"
})
@XmlRootElement(name = "PutContractStatus")
public class PutContractStatus {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected String contractId;
    @XmlElement(required = true)
    protected String approvalStage;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the approvalStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStage() {
        return approvalStage;
    }

    /**
     * Sets the value of the approvalStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStage(String value) {
        this.approvalStage = value;
    }

}
