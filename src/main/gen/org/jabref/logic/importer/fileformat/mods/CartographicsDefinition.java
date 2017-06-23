//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 01:38:18 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cartographicsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartographicsDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}scale" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}projection" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}coordinates" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}cartographicExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}authorityAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartographicsDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "scale",
    "projection",
    "coordinates",
    "cartographicExtension"
})
public class CartographicsDefinition {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected StringPlusLanguage scale;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected StringPlusLanguage projection;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<StringPlusLanguage> coordinates;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<ExtensionDefinition> cartographicExtension;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusLanguage }
     *     
     */
    public StringPlusLanguage getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusLanguage }
     *     
     */
    public void setScale(StringPlusLanguage value) {
        this.scale = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusLanguage }
     *     
     */
    public StringPlusLanguage getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusLanguage }
     *     
     */
    public void setProjection(StringPlusLanguage value) {
        this.projection = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<StringPlusLanguage>();
        }
        return this.coordinates;
    }

    /**
     * Gets the value of the cartographicExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartographicExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartographicExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionDefinition }
     * 
     * 
     */
    public List<ExtensionDefinition> getCartographicExtension() {
        if (cartographicExtension == null) {
            cartographicExtension = new ArrayList<ExtensionDefinition>();
        }
        return this.cartographicExtension;
    }

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
