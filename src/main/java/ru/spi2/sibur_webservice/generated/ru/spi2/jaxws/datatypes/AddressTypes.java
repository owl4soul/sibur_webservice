
package ru.spi2.sibur_webservice.generated.ru.spi2.jaxws.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEGALADDR"/>
 *     &lt;enumeration value="POSTADDR"/>
 *     &lt;enumeration value="ACTUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressTypes")
@XmlEnum
public enum AddressTypes {

    LEGALADDR,
    POSTADDR,
    ACTUAL;

    public String value() {
        return name();
    }

    public static AddressTypes fromValue(String v) {
        return valueOf(v);
    }

}
