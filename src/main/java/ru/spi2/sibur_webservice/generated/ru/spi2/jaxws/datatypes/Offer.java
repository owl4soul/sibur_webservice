
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Offer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sap_srm_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="prtcip_request_guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offertaAmmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="confirmAbility" type="{http://spi2.ru/jaxws/datatypes}Attachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer", propOrder = {
    "sapSrmId",
    "prtcipRequestGuid",
    "offertaAmmount",
    "confirmAbility"
})
public class Offer {

    @XmlElement(name = "sap_srm_id", required = true)
    protected BigDecimal sapSrmId;
    @XmlElement(name = "prtcip_request_guid", required = true)
    protected String prtcipRequestGuid;
    protected BigDecimal offertaAmmount;
    protected Attachment confirmAbility;

    /**
     * Gets the value of the sapSrmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSapSrmId() {
        return sapSrmId;
    }

    /**
     * Sets the value of the sapSrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSapSrmId(BigDecimal value) {
        this.sapSrmId = value;
    }

    /**
     * Gets the value of the prtcipRequestGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcipRequestGuid() {
        return prtcipRequestGuid;
    }

    /**
     * Sets the value of the prtcipRequestGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcipRequestGuid(String value) {
        this.prtcipRequestGuid = value;
    }

    /**
     * Gets the value of the offertaAmmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffertaAmmount() {
        return offertaAmmount;
    }

    /**
     * Sets the value of the offertaAmmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffertaAmmount(BigDecimal value) {
        this.offertaAmmount = value;
    }

    /**
     * Gets the value of the confirmAbility property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getConfirmAbility() {
        return confirmAbility;
    }

    /**
     * Sets the value of the confirmAbility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setConfirmAbility(Attachment value) {
        this.confirmAbility = value;
    }

}
