
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutCounterpartyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutCounterpartyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="registrationRegrequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterparty" type="{http://spi2.ru/jaxws/datatypes}Counterparty" minOccurs="0"/>
 *         &lt;element name="counterpartySapIdentities" type="{http://spi2.ru/jaxws/datatypes}CounterpartySapIdentities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutCounterpartyInfo", propOrder = {
    "header",
    "registrationRegrequestId",
    "counterparty",
    "counterpartySapIdentities"
})
@XmlRootElement(name = "PutCounterpartyInfo")
public class PutCounterpartyInfo {

    @XmlElement(required = true)
    protected Header header;
    protected String registrationRegrequestId;
    protected Counterparty counterparty;
    @XmlElement(required = true)
    protected CounterpartySapIdentities counterpartySapIdentities;

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
     * Gets the value of the registrationRegrequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationRegrequestId() {
        return registrationRegrequestId;
    }

    /**
     * Sets the value of the registrationRegrequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationRegrequestId(String value) {
        this.registrationRegrequestId = value;
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

    /**
     * Gets the value of the counterpartySapIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartySapIdentities }
     *     
     */
    public CounterpartySapIdentities getCounterpartySapIdentities() {
        return counterpartySapIdentities;
    }

    /**
     * Sets the value of the counterpartySapIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartySapIdentities }
     *     
     */
    public void setCounterpartySapIdentities(CounterpartySapIdentities value) {
        this.counterpartySapIdentities = value;
    }

}
