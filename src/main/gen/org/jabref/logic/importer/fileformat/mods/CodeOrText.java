//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 01:38:18 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codeOrText.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codeOrText">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codeOrText", namespace = "http://www.loc.gov/mods/v3")
@XmlEnum
public enum CodeOrText {

    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    CodeOrText(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeOrText fromValue(String v) {
        for (CodeOrText c: CodeOrText.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
