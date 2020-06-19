
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckAndSaveRegistrCounterpartySRM_Async complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckAndSaveRegistrCounterpartySRM_Async">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="registrreq_guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterparty" type="{http://spi2.ru/jaxws/datatypes}Counterparty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckAndSaveRegistrCounterpartySRM_Async", propOrder = {
    "header",
    "registrreqGuid",
    "counterparty"
})
@XmlRootElement(name = "CheckAndSaveRegistrCounterpartySRM_Async")
public class CheckAndSaveRegistrCounterpartySRMAsync {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(name = "registrreq_guid")
    protected String registrreqGuid;
    protected Counterparty counterparty;

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
     * Gets the value of the registrreqGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrreqGuid() {
        return registrreqGuid;
    }

    /**
     * Sets the value of the registrreqGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrreqGuid(String value) {
        this.registrreqGuid = value;
    }

    /**
     * Gets the value of the counterparty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty }
     *     
     */
    public Counterparty getCounterparty() {
        return counterparty;
    }

    /**
     * Sets the value of the counterparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty }
     *     
     */
    public void setCounterparty(Counterparty value) {
        this.counterparty = value;
    }

}
