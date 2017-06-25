//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.25 at 02:33:39 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for modsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modsDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded"/>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="3.6"/>
 *             &lt;enumeration value="3.5"/>
 *             &lt;enumeration value="3.4"/>
 *             &lt;enumeration value="3.3"/>
 *             &lt;enumeration value="3.2"/>
 *             &lt;enumeration value="3.1"/>
 *             &lt;enumeration value="3.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modsDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "modsGroup"
})
public class ModsDefinition {

    @XmlElements({
        @XmlElement(name = "abstract", namespace = "http://www.loc.gov/mods/v3", type = AbstractDefinition.class),
        @XmlElement(name = "accessCondition", namespace = "http://www.loc.gov/mods/v3", type = AccessConditionDefinition.class),
        @XmlElement(name = "classification", namespace = "http://www.loc.gov/mods/v3", type = ClassificationDefinition.class),
        @XmlElement(name = "extension", namespace = "http://www.loc.gov/mods/v3", type = ExtensionDefinition.class),
        @XmlElement(name = "genre", namespace = "http://www.loc.gov/mods/v3", type = GenreDefinition.class),
        @XmlElement(name = "identifier", namespace = "http://www.loc.gov/mods/v3", type = IdentifierDefinition.class),
        @XmlElement(name = "language", namespace = "http://www.loc.gov/mods/v3", type = LanguageDefinition.class),
        @XmlElement(name = "location", namespace = "http://www.loc.gov/mods/v3", type = LocationDefinition.class),
        @XmlElement(name = "name", namespace = "http://www.loc.gov/mods/v3", type = NameDefinition.class),
        @XmlElement(name = "note", namespace = "http://www.loc.gov/mods/v3", type = NoteDefinition.class),
        @XmlElement(name = "originInfo", namespace = "http://www.loc.gov/mods/v3", type = OriginInfoDefinition.class),
        @XmlElement(name = "part", namespace = "http://www.loc.gov/mods/v3", type = PartDefinition.class),
        @XmlElement(name = "physicalDescription", namespace = "http://www.loc.gov/mods/v3", type = PhysicalDescriptionDefinition.class),
        @XmlElement(name = "recordInfo", namespace = "http://www.loc.gov/mods/v3", type = RecordInfoDefinition.class),
        @XmlElement(name = "relatedItem", namespace = "http://www.loc.gov/mods/v3", type = RelatedItemDefinition.class),
        @XmlElement(name = "subject", namespace = "http://www.loc.gov/mods/v3", type = SubjectDefinition.class),
        @XmlElement(name = "tableOfContents", namespace = "http://www.loc.gov/mods/v3", type = TableOfContentsDefinition.class),
        @XmlElement(name = "targetAudience", namespace = "http://www.loc.gov/mods/v3", type = TargetAudienceDefinition.class),
        @XmlElement(name = "titleInfo", namespace = "http://www.loc.gov/mods/v3", type = TitleInfoDefinition.class),
        @XmlElement(name = "typeOfResource", namespace = "http://www.loc.gov/mods/v3", type = TypeOfResourceDefinition.class)
    })
    protected List<Object> modsGroup;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the modsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractDefinition }
     * {@link AccessConditionDefinition }
     * {@link ClassificationDefinition }
     * {@link ExtensionDefinition }
     * {@link GenreDefinition }
     * {@link IdentifierDefinition }
     * {@link LanguageDefinition }
     * {@link LocationDefinition }
     * {@link NameDefinition }
     * {@link NoteDefinition }
     * {@link OriginInfoDefinition }
     * {@link PartDefinition }
     * {@link PhysicalDescriptionDefinition }
     * {@link RecordInfoDefinition }
     * {@link RelatedItemDefinition }
     * {@link SubjectDefinition }
     * {@link TableOfContentsDefinition }
     * {@link TargetAudienceDefinition }
     * {@link TitleInfoDefinition }
     * {@link TypeOfResourceDefinition }
     * 
     * 
     */
    public List<Object> getModsGroup() {
        if (modsGroup == null) {
            modsGroup = new ArrayList<Object>();
        }
        return this.modsGroup;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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

}
