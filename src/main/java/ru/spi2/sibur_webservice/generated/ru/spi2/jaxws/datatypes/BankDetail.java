
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="swift" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkingAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankDetail", propOrder = {
    "country",
    "bic",
    "swift",
    "checkingAccount",
    "accountCurrency",
    "bankName",
    "correspondentAccount",
    "bankAddress"
})
public class BankDetail {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String bic;
    @XmlElement(required = true)
    protected String swift;
    @XmlElement(required = true)
    protected String checkingAccount;
    @XmlElement(required = true)
    protected String accountCurrency;
    protected String bankName;
    protected String correspondentAccount;
    protected String bankAddress;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwift() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwift(String value) {
        this.swift = value;
    }

    /**
     * Gets the value of the checkingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckingAccount() {
        return checkingAccount;
    }

    /**
     * Sets the value of the checkingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckingAccount(String value) {
        this.checkingAccount = value;
    }

    /**
     * Gets the value of the accountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCurrency() {
        return accountCurrency;
    }

    /**
     * Sets the value of the accountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCurrency(String value) {
        this.accountCurrency = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the correspondentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentAccount() {
        return correspondentAccount;
    }

    /**
     * Sets the value of the correspondentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondentAccount(String value) {
        this.correspondentAccount = value;
    }

    /**
     * Gets the value of the bankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * Sets the value of the bankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAddress(String value) {
        this.bankAddress = value;
    }

}
