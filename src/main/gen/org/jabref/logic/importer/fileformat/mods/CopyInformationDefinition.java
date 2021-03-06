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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for copyInformationDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyInformationDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}form" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}subLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}electronicLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusLanguage">
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *                 &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}enumerationAndChronology" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}itemIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyInformationDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "form",
    "subLocation",
    "shelfLocator",
    "electronicLocator",
    "note",
    "enumerationAndChronology",
    "itemIdentifier"
})
public class CopyInformationDefinition {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected FormDefinition form;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<StringPlusLanguage> subLocation;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<StringPlusLanguage> shelfLocator;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<StringPlusLanguage> electronicLocator;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<CopyInformationDefinition.Note> note;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<EnumerationAndChronologyDefinition> enumerationAndChronology;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<ItemIdentifierDefinition> itemIdentifier;

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link FormDefinition }
     *     
     */
    public FormDefinition getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDefinition }
     *     
     */
    public void setForm(FormDefinition value) {
        this.form = value;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getSubLocation() {
        if (subLocation == null) {
            subLocation = new ArrayList<StringPlusLanguage>();
        }
        return this.subLocation;
    }

    /**
     * Gets the value of the shelfLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelfLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelfLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getShelfLocator() {
        if (shelfLocator == null) {
            shelfLocator = new ArrayList<StringPlusLanguage>();
        }
        return this.shelfLocator;
    }

    /**
     * Gets the value of the electronicLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getElectronicLocator() {
        if (electronicLocator == null) {
            electronicLocator = new ArrayList<StringPlusLanguage>();
        }
        return this.electronicLocator;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyInformationDefinition.Note }
     * 
     * 
     */
    public List<CopyInformationDefinition.Note> getNote() {
        if (note == null) {
            note = new ArrayList<CopyInformationDefinition.Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the enumerationAndChronology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationAndChronology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationAndChronology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationAndChronologyDefinition }
     * 
     * 
     */
    public List<EnumerationAndChronologyDefinition> getEnumerationAndChronology() {
        if (enumerationAndChronology == null) {
            enumerationAndChronology = new ArrayList<EnumerationAndChronologyDefinition>();
        }
        return this.enumerationAndChronology;
    }

    /**
     * Gets the value of the itemIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentifierDefinition }
     * 
     * 
     */
    public List<ItemIdentifierDefinition> getItemIdentifier() {
        if (itemIdentifier == null) {
            itemIdentifier = new ArrayList<ItemIdentifierDefinition>();
        }
        return this.itemIdentifier;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusLanguage">
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
     *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Note
        extends StringPlusLanguage
    {

        @XmlAttribute(name = "displayLabel")
        protected String displayLabel;
        @XmlAttribute(name = "type")
        protected String atType;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        protected String type;
        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        @XmlSchemaType(name = "anyURI")
        protected String href;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected String show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected String actuate;

        /**
         * Gets the value of the displayLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayLabel() {
            return displayLabel;
        }

        /**
         * Sets the value of the displayLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayLabel(String value) {
            this.displayLabel = value;
        }

        /**
         * Gets the value of the atType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtType() {
            return atType;
        }

        /**
         * Sets the value of the atType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtType(String value) {
            this.atType = value;
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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "simple";
            } else {
                return type;
            }
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
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the arcrole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Sets the value of the arcrole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the show property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShow(String value) {
            this.show = value;
        }

        /**
         * Gets the value of the actuate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActuate() {
            return actuate;
        }

        /**
         * Sets the value of the actuate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActuate(String value) {
            this.actuate = value;
        }

    }

}
