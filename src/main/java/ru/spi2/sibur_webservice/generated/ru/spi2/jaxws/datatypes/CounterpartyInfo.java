
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterpartyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asvnsicode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyInfo", propOrder = {
    "asvnsicode"
})
public class CounterpartyInfo {

    @XmlElement(required = true)
    protected String asvnsicode;

    /**
     * Gets the value of the asvnsicode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsvnsicode() {
        return asvnsicode;
    }

    /**
     * Sets the value of the asvnsicode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsvnsicode(String value) {
        this.asvnsicode = value;
    }

}
