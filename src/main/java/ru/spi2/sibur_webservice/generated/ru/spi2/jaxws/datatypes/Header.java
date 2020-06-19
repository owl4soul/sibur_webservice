
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="externalsystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="senddate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "requestid",
    "externalsystem",
    "requestdate",
    "senddate"
})
public class Header {

    protected long requestid;
    @XmlElement(required = true)
    protected String externalsystem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar senddate;

    /**
     * Gets the value of the requestid property.
     * 
     */
    public long getRequestid() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     */
    public void setRequestid(long value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalsystem() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalsystem(String value) {
        this.externalsystem = value;
    }

    /**
     * Gets the value of the requestdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestdate() {
        return requestdate;
    }

    /**
     * Sets the value of the requestdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestdate(XMLGregorianCalendar value) {
        this.requestdate = value;
    }

    /**
     * Gets the value of the senddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSenddate() {
        return senddate;
    }

    /**
     * Sets the value of the senddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSenddate(XMLGregorianCalendar value) {
        this.senddate = value;
    }

}
