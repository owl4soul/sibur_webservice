
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CISTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CISTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="task_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://spi2.ru/jaxws/datatypes}Contract"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CISTask", propOrder = {
    "taskId",
    "taskUrl",
    "taskDateTime",
    "contract"
})
public class CISTask {

    @XmlElement(name = "task_id", required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String taskUrl;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taskDateTime;
    @XmlElement(required = true)
    protected Contract contract;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskUrl() {
        return taskUrl;
    }

    /**
     * Sets the value of the taskUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskUrl(String value) {
        this.taskUrl = value;
    }

    /**
     * Gets the value of the taskDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaskDateTime() {
        return taskDateTime;
    }

    /**
     * Sets the value of the taskDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaskDateTime(XMLGregorianCalendar value) {
        this.taskDateTime = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

}
