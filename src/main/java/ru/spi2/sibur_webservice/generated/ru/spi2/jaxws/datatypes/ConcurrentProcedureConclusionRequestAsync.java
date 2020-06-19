
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConcurrentProcedureConclusionRequestAsync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcurrentProcedureConclusionRequestAsync">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="concurrentProcedure" type="{http://spi2.ru/jaxws/datatypes}ConcurrentProcedure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcurrentProcedureConclusionRequestAsync", propOrder = {
    "header",
    "concurrentProcedure"
})
@XmlRootElement(name = "ConcurrentProcedureConclusionRequestAsync")
public class ConcurrentProcedureConclusionRequestAsync {

    @XmlElement(required = true)
    protected Header header;
    protected ConcurrentProcedure concurrentProcedure;

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
     * Gets the value of the concurrentProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ConcurrentProcedure }
     *     
     */
    public ConcurrentProcedure getConcurrentProcedure() {
        return concurrentProcedure;
    }

    /**
     * Sets the value of the concurrentProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcurrentProcedure }
     *     
     */
    public void setConcurrentProcedure(ConcurrentProcedure value) {
        this.concurrentProcedure = value;
    }

}
