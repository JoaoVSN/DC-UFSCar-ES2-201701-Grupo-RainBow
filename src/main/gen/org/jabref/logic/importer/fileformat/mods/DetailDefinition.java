//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 01:38:18 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.loc.gov/mods/v3}number"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}caption"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}title"/>
 *       &lt;/choice>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "numberOrCaptionOrTitle"
})
public class DetailDefinition {

    @XmlElementRefs({
        @XmlElementRef(name = "caption", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "number", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<StringPlusLanguage>> numberOrCaptionOrTitle;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "level")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger level;

    /**
     * Gets the value of the numberOrCaptionOrTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOrCaptionOrTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOrCaptionOrTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StringPlusLanguage }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusLanguage }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusLanguage }{@code >}
     * 
     * 
     */
    public List<JAXBElement<StringPlusLanguage>> getNumberOrCaptionOrTitle() {
        if (numberOrCaptionOrTitle == null) {
            numberOrCaptionOrTitle = new ArrayList<JAXBElement<StringPlusLanguage>>();
        }
        return this.numberOrCaptionOrTitle;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

}
