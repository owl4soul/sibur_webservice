
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contract_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="card_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="user_conract_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sibur_org" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="reg_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reg_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="counterparty_info" type="{http://spi2.ru/jaxws/datatypes}CounterpartyInfo"/>
 *         &lt;element name="contract_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procedure_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="sub_category" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="kind_dd" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="amount_vv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amount_transaction" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amount_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="framework" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="advance_payment_type" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="advance_payment_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="postponement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kind_vz" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="safe_list" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approval_stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receive_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="completeon_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="visa" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="be" type="{http://spi2.ru/jaxws/datatypes}Dictionary" minOccurs="0"/>
 *         &lt;element name="person_list" type="{http://spi2.ru/jaxws/datatypes}ContractPerson" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "contractId",
    "docDate",
    "cardDate",
    "userConractId",
    "siburOrg",
    "regNum",
    "regDate",
    "counterpartyInfo",
    "contractUrl",
    "procedureNumber",
    "subject",
    "subCategory",
    "kind",
    "kindDd",
    "amountVv",
    "amountTransaction",
    "amountTotal",
    "framework",
    "advancePaymentType",
    "advancePaymentAmount",
    "postponement",
    "kindVz",
    "safeList",
    "isDefault",
    "urgent",
    "approvalStage",
    "version",
    "receiveDate",
    "completeonDate",
    "visa",
    "note",
    "be",
    "personList"
})
public class Contract {

    @XmlElement(name = "contract_id", required = true)
    protected String contractId;
    @XmlElement(name = "doc_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "card_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardDate;
    @XmlElement(name = "user_conract_id")
    protected String userConractId;
    @XmlElement(name = "sibur_org")
    protected Dictionary siburOrg;
    @XmlElement(name = "reg_num", required = true)
    protected String regNum;
    @XmlElement(name = "reg_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;
    @XmlElement(name = "counterparty_info", required = true)
    protected CounterpartyInfo counterpartyInfo;
    @XmlElement(name = "contract_url")
    protected String contractUrl;
    @XmlElement(name = "procedure_number")
    protected String procedureNumber;
    protected Dictionary subject;
    @XmlElement(name = "sub_category")
    protected Dictionary subCategory;
    protected Dictionary kind;
    @XmlElement(name = "kind_dd")
    protected Dictionary kindDd;
    @XmlElement(name = "amount_vv")
    protected BigDecimal amountVv;
    @XmlElement(name = "amount_transaction")
    protected BigDecimal amountTransaction;
    @XmlElement(name = "amount_total")
    protected BigDecimal amountTotal;
    protected boolean framework;
    @XmlElement(name = "advance_payment_type")
    protected Dictionary advancePaymentType;
    @XmlElement(name = "advance_payment_amount")
    protected BigDecimal advancePaymentAmount;
    protected boolean postponement;
    @XmlElement(name = "kind_vz")
    protected Dictionary kindVz;
    @XmlElement(name = "safe_list")
    protected boolean safeList;
    @XmlElement(name = "is_default")
    protected String isDefault;
    protected String urgent;
    @XmlElement(name = "approval_stage")
    protected String approvalStage;
    protected String version;
    @XmlElement(name = "receive_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveDate;
    @XmlElement(name = "completeon_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeonDate;
    protected Dictionary visa;
    protected String note;
    protected Dictionary be;
    @XmlElement(name = "person_list")
    protected List<ContractPerson> personList;

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the cardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardDate() {
        return cardDate;
    }

    /**
     * Sets the value of the cardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardDate(XMLGregorianCalendar value) {
        this.cardDate = value;
    }

    /**
     * Gets the value of the userConractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserConractId() {
        return userConractId;
    }

    /**
     * Sets the value of the userConractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserConractId(String value) {
        this.userConractId = value;
    }

    /**
     * Gets the value of the siburOrg property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getSiburOrg() {
        return siburOrg;
    }

    /**
     * Sets the value of the siburOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setSiburOrg(Dictionary value) {
        this.siburOrg = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the counterpartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyInfo }
     *     
     */
    public CounterpartyInfo getCounterpartyInfo() {
        return counterpartyInfo;
    }

    /**
     * Sets the value of the counterpartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyInfo }
     *     
     */
    public void setCounterpartyInfo(CounterpartyInfo value) {
        this.counterpartyInfo = value;
    }

    /**
     * Gets the value of the contractUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractUrl() {
        return contractUrl;
    }

    /**
     * Sets the value of the contractUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractUrl(String value) {
        this.contractUrl = value;
    }

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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setSubject(Dictionary value) {
        this.subject = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setSubCategory(Dictionary value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setKind(Dictionary value) {
        this.kind = value;
    }

    /**
     * Gets the value of the kindDd property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getKindDd() {
        return kindDd;
    }

    /**
     * Sets the value of the kindDd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setKindDd(Dictionary value) {
        this.kindDd = value;
    }

    /**
     * Gets the value of the amountVv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountVv() {
        return amountVv;
    }

    /**
     * Sets the value of the amountVv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountVv(BigDecimal value) {
        this.amountVv = value;
    }

    /**
     * Gets the value of the amountTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountTransaction() {
        return amountTransaction;
    }

    /**
     * Sets the value of the amountTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountTransaction(BigDecimal value) {
        this.amountTransaction = value;
    }

    /**
     * Gets the value of the amountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    /**
     * Sets the value of the amountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountTotal(BigDecimal value) {
        this.amountTotal = value;
    }

    /**
     * Gets the value of the framework property.
     * 
     */
    public boolean isFramework() {
        return framework;
    }

    /**
     * Sets the value of the framework property.
     * 
     */
    public void setFramework(boolean value) {
        this.framework = value;
    }

    /**
     * Gets the value of the advancePaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getAdvancePaymentType() {
        return advancePaymentType;
    }

    /**
     * Sets the value of the advancePaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setAdvancePaymentType(Dictionary value) {
        this.advancePaymentType = value;
    }

    /**
     * Gets the value of the advancePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvancePaymentAmount() {
        return advancePaymentAmount;
    }

    /**
     * Sets the value of the advancePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvancePaymentAmount(BigDecimal value) {
        this.advancePaymentAmount = value;
    }

    /**
     * Gets the value of the postponement property.
     * 
     */
    public boolean isPostponement() {
        return postponement;
    }

    /**
     * Sets the value of the postponement property.
     * 
     */
    public void setPostponement(boolean value) {
        this.postponement = value;
    }

    /**
     * Gets the value of the kindVz property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getKindVz() {
        return kindVz;
    }

    /**
     * Sets the value of the kindVz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setKindVz(Dictionary value) {
        this.kindVz = value;
    }

    /**
     * Gets the value of the safeList property.
     * 
     */
    public boolean isSafeList() {
        return safeList;
    }

    /**
     * Sets the value of the safeList property.
     * 
     */
    public void setSafeList(boolean value) {
        this.safeList = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the urgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgent() {
        return urgent;
    }

    /**
     * Sets the value of the urgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgent(String value) {
        this.urgent = value;
    }

    /**
     * Gets the value of the approvalStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStage() {
        return approvalStage;
    }

    /**
     * Sets the value of the approvalStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStage(String value) {
        this.approvalStage = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the completeonDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteonDate() {
        return completeonDate;
    }

    /**
     * Sets the value of the completeonDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteonDate(XMLGregorianCalendar value) {
        this.completeonDate = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setVisa(Dictionary value) {
        this.visa = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setBe(Dictionary value) {
        this.be = value;
    }

    /**
     * Gets the value of the personList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPerson }
     * 
     * 
     */
    public List<ContractPerson> getPersonList() {
        if (personList == null) {
            personList = new ArrayList<ContractPerson>();
        }
        return this.personList;
    }

}
