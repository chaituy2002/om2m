//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.24 at 02:12:54 AM CEST
//


package org.eclipse.om2m.commons.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java Class for PermissionHolderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PermissionHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}holderRefs" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}applicationIDs" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}sclIDs" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}all" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}domains" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionHolderType", propOrder = {
        "holderRefs",
        "applicationIDs",
        "sclIDs",
        "all",
        "domains"
})
public class PermissionHolderType {

    protected HolderRefListType holderRefs;
    protected ApplicationIDs applicationIDs;
    protected SclIDs sclIDs;
    protected All all;
    protected DomainListType domains;

    /**
     * Gets the value of the property holderRefs.
     *
     * @return
     *     possible object is
     *     {@link HolderRefListType }
     *
     */
    public HolderRefListType getHolderRefs() {
        return holderRefs;
    }

    /**
     * Sets the value of the property holderRefs.
     *
     * @param value
     *     allowed object is
     *     {@link HolderRefListType }
     *
     */
    public void setHolderRefs(HolderRefListType value) {
        this.holderRefs = value;
    }

    /**
     * Gets the value of the property applicationIDs.
     *
     * @return
     *     possible object is
     *     {@link ApplicationIDs }
     *
     */
    public ApplicationIDs getApplicationIDs() {
        return applicationIDs;
    }

    /**
     * Sets the value of the property applicationIDs.
     *
     * @param value
     *     allowed object is
     *     {@link ApplicationIDs }
     *
     */
    public void setApplicationIDs(ApplicationIDs value) {
        this.applicationIDs = value;
    }

    /**
     * Gets the value of the property sclIDs.
     *
     * @return
     *     possible object is
     *     {@link SclIDs }
     *
     */
    public SclIDs getSclIDs() {
        return sclIDs;
    }

    /**
     * Sets the value of the property sclIDs.
     *
     * @param value
     *     allowed object is
     *     {@link SclIDs }
     *
     */
    public void setSclIDs(SclIDs value) {
        this.sclIDs = value;
    }

    /**
     * Gets the value of the property all.
     *
     * @return
     *     possible object is
     *     {@link All }
     *
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the property all.
     *
     * @param value
     *     allowed object is
     *     {@link All }
     *
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Gets the value of the property domains.
     *
     * @return
     *     possible object is
     *     {@link DomainListType }
     *
     */
    public DomainListType getDomains() {
        return domains;
    }

    /**
     * Sets the value of the property domains.
     *
     * @param value
     *     allowed object is
     *     {@link DomainListType }
     *
     */
    public void setDomains(DomainListType value) {
        this.domains = value;
    }

}
