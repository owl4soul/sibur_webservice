
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractConclusionRequestAsync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractConclusionRequestAsync">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="cisTask" type="{http://spi2.ru/jaxws/datatypes}CISTask"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractConclusionRequestAsync", propOrder = {
    "header",
    "cisTask"
})
@XmlRootElement(name = "ContractConclusionRequestAsync")
public class ContractConclusionRequestAsync {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected CISTask cisTask;

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
     * Gets the value of the cisTask property.
     * 
     * @return
     *     possible object is
     *     {@link CISTask }
     *     
     */
    public CISTask getCisTask() {
        return cisTask;
    }

    /**
     * Sets the value of the cisTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISTask }
     *     
     */
    public void setCisTask(CISTask value) {
        this.cisTask = value;
    }

}
