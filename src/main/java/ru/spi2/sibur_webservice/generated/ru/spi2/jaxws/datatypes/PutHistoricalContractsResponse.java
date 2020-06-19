
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutHistoricalContractsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutHistoricalContractsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseSync" type="{http://spi2.ru/jaxws/datatypes}SyncResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutHistoricalContractsResponse", propOrder = {
    "responseSync"
})
public class PutHistoricalContractsResponse {

    @XmlElement(name = "ResponseSync", namespace = "http://spi2.ru/jaxws/datatypes")
    protected SyncResponse responseSync;

    /**
     * Gets the value of the responseSync property.
     * 
     * @return
     *     possible object is
     *     {@link SyncResponse }
     *     
     */
    public SyncResponse getResponseSync() {
        return responseSync;
    }

    /**
     * Sets the value of the responseSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncResponse }
     *     
     */
    public void setResponseSync(SyncResponse value) {
        this.responseSync = value;
    }

}
