//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 01:38:14 AM BRT 
//


package org.jabref.logic.importer.fileformat.medline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}LocationLabel" minOccurs="0"/>
 *         &lt;element ref="{}SectionTitle"/>
 *         &lt;element ref="{}Section" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationLabel",
    "sectionTitle",
    "section"
})
@XmlRootElement(name = "Section")
public class Section {

    @XmlElement(name = "LocationLabel")
    protected LocationLabel locationLabel;
    @XmlElement(name = "SectionTitle", required = true)
    protected SectionTitle sectionTitle;
    @XmlElement(name = "Section")
    protected List<Section> section;

    /**
     * Gets the value of the locationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link LocationLabel }
     *     
     */
    public LocationLabel getLocationLabel() {
        return locationLabel;
    }

    /**
     * Sets the value of the locationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationLabel }
     *     
     */
    public void setLocationLabel(LocationLabel value) {
        this.locationLabel = value;
    }

    /**
     * Gets the value of the sectionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SectionTitle }
     *     
     */
    public SectionTitle getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Sets the value of the sectionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionTitle }
     *     
     */
    public void setSectionTitle(SectionTitle value) {
        this.sectionTitle = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section }
     * 
     * 
     */
    public List<Section> getSection() {
        if (section == null) {
            section = new ArrayList<Section>();
        }
        return this.section;
    }

}
