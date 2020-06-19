
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutHistoricalContracts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutHistoricalContracts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://spi2.ru/jaxws/datatypes}Header"/>
 *         &lt;element name="contracts" type="{http://spi2.ru/jaxws/datatypes}Contract" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutHistoricalContracts", propOrder = {
    "header",
    "contracts"
})
@XmlRootElement(name = "PutHistoricalContracts")
public class PutHistoricalContracts {

    @XmlElement(required = true)
    protected Header header;
    protected List<Contract> contracts;

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
     * Gets the value of the contracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contract }
     * 
     * 
     */
    public List<Contract> getContracts() {
        if (contracts == null) {
            contracts = new ArrayList<Contract>();
        }
        return this.contracts;
    }

}
