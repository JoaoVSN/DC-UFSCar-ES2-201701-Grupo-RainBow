//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.25 at 02:33:25 AM BRT 
//


package org.jabref.logic.importer.fileformat.bibtexml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthTypeString.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="monthTypeString">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Jan"/>
 *     &lt;enumeration value="Feb"/>
 *     &lt;enumeration value="Mar"/>
 *     &lt;enumeration value="Apr"/>
 *     &lt;enumeration value="May"/>
 *     &lt;enumeration value="Jun"/>
 *     &lt;enumeration value="Jul"/>
 *     &lt;enumeration value="Aug"/>
 *     &lt;enumeration value="Sep"/>
 *     &lt;enumeration value="Oct"/>
 *     &lt;enumeration value="Nov"/>
 *     &lt;enumeration value="Dec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "monthTypeString")
@XmlEnum
public enum MonthTypeString {

    @XmlEnumValue("Jan")
    JAN("Jan"),
    @XmlEnumValue("Feb")
    FEB("Feb"),
    @XmlEnumValue("Mar")
    MAR("Mar"),
    @XmlEnumValue("Apr")
    APR("Apr"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("Jun")
    JUN("Jun"),
    @XmlEnumValue("Jul")
    JUL("Jul"),
    @XmlEnumValue("Aug")
    AUG("Aug"),
    @XmlEnumValue("Sep")
    SEP("Sep"),
    @XmlEnumValue("Oct")
    OCT("Oct"),
    @XmlEnumValue("Nov")
    NOV("Nov"),
    @XmlEnumValue("Dec")
    DEC("Dec");
    private final String value;

    MonthTypeString(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthTypeString fromValue(String v) {
        for (MonthTypeString c: MonthTypeString.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
