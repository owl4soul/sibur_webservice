
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConcurrentProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcurrentProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedureNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procedureStepNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="participatorsOffers" type="{http://spi2.ru/jaxws/datatypes}Offer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcurrentProcedure", propOrder = {
    "procedureNumber",
    "procedureStepNumber",
    "status",
    "statusDate",
    "participatorsOffers"
})
public class ConcurrentProcedure {

    @XmlElement(required = true)
    protected String procedureNumber;
    @XmlElement(required = true)
    protected String procedureStepNumber;
    protected String status;
    @XmlElement(name = "status_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(required = true)
    protected List<Offer> participatorsOffers;

    /**
     * Gets the value of the procedureNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureNumber() {
        return procedureNumber;
    }

    /**
     * Sets the value of the procedureNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureNumber(String value) {
        this.procedureNumber = value;
    }

    /**
     * Gets the value of the procedureStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureStepNumber() {
        return procedureStepNumber;
    }

    /**
     * Sets the value of the procedureStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureStepNumber(String value) {
        this.procedureStepNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the participatorsOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatorsOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatorsOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offer }
     * 
     * 
     */
    public List<Offer> getParticipatorsOffers() {
        if (participatorsOffers == null) {
            participatorsOffers = new ArrayList<Offer>();
        }
        return this.participatorsOffers;
    }

}
