//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 12:23:37 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temporalDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="temporalDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>dateDefinition">
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}authorityAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temporalDefinition", namespace = "http://www.loc.gov/mods/v3")
public class TemporalDefinition
    extends DateDefinition
{

    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the authorityURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityURI() {
        return authorityURI;
    }

    /**
     * Sets the value of the authorityURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityURI(String value) {
        this.authorityURI = value;
    }

    /**
     * Gets the value of the valueURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueURI() {
        return valueURI;
    }

    /**
     * Sets the value of the valueURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueURI(String value) {
        this.valueURI = value;
    }

}
