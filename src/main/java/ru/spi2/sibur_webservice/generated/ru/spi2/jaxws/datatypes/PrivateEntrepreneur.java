
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateEntrepreneur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateEntrepreneur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ogrnip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="okpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asv_nsi_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sparkid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateEntrepreneur", propOrder = {
    "inn",
    "ogrnip",
    "fio",
    "okpo",
    "asvNsiCode",
    "sparkid"
})
public class PrivateEntrepreneur {

    @XmlElement(required = true)
    protected String inn;
    @XmlElement(required = true)
    protected String ogrnip;
    protected String fio;
    protected String okpo;
    @XmlElement(name = "asv_nsi_code")
    protected String asvNsiCode;
    protected String sparkid;

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrnip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrnip() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrnip(String value) {
        this.ogrnip = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkpo() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkpo(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the asvNsiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsvNsiCode() {
        return asvNsiCode;
    }

    /**
     * Sets the value of the asvNsiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsvNsiCode(String value) {
        this.asvNsiCode = value;
    }

    /**
     * Gets the value of the sparkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSparkid() {
        return sparkid;
    }

    /**
     * Sets the value of the sparkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSparkid(String value) {
        this.sparkid = value;
    }

}
