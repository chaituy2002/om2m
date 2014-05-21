//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.24 at 02:40:55 AM CEST
//


package org.eclipse.om2m.commons.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java Class for MgmtCmd complex type.
 *
 * <p>MgmtCmd is only used to model non-RESTful management commands.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MgmtCmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}expirationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightID" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}searchStrings" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}creationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}lastModifiedTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}description" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}cmdType" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}execEnable" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}execReqArgs" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}execInstancesReference" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}subscriptionsReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://uri.etsi.org/m2m}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MgmtCmd extends Resource {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    protected String description;
    protected CmdType cmdType;
    @XmlSchemaType(name = "anyURI")
    protected String execEnable;
    protected ExecReqArgsList execReqArgs;
    @XmlSchemaType(name = "anyURI")
    protected String execInstancesReference;
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionsReference;
    @XmlAttribute(name = "id", namespace = "http://uri.etsi.org/m2m")
    @XmlSchemaType(name = "anyURI")
    protected String id;

    /**
     * Gets the value of the property expirationTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the property expirationTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the property searchStrings.
     *
     * @return
     *     possible object is
     *     {@link SearchStrings }
     *
     */
    public SearchStrings getSearchStrings() {
        return searchStrings;
    }

    /**
     * Sets the value of the property searchStrings.
     *
     * @param value
     *     allowed object is
     *     {@link SearchStrings }
     *
     */
    public void setSearchStrings(SearchStrings value) {
        this.searchStrings = value;
    }

    /**
     * Gets the value of the property creationTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the property creationTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the property lastModifiedTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the property lastModifiedTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the property description.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the property description.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the property cmdType.
     *
     * @return
     *     possible object is
     *     {@link CmdType }
     *
     */
    public CmdType getCmdType() {
        return cmdType;
    }

    /**
     * Sets the value of the property cmdType.
     *
     * @param value
     *     allowed object is
     *     {@link CmdType }
     *
     */
    public void setCmdType(CmdType value) {
        this.cmdType = value;
    }

    /**
     * Gets the value of the property execEnable.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecEnable() {
        return execEnable;
    }

    /**
     * Sets the value of the property execEnable.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecEnable(String value) {
        this.execEnable = value;
    }

    /**
     * Gets the value of the property execReqArgs.
     *
     * @return
     *     possible object is
     *     {@link ExecReqArgsList }
     *
     */
    public ExecReqArgsList getExecReqArgs() {
        return execReqArgs;
    }

    /**
     * Sets the value of the property execReqArgs.
     *
     * @param value
     *     allowed object is
     *     {@link ExecReqArgsList }
     *
     */
    public void setExecReqArgs(ExecReqArgsList value) {
        this.execReqArgs = value;
    }

    /**
     * Gets the value of the property execInstancesReference.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecInstancesReference() {
        return execInstancesReference;
    }

    /**
     * Sets the value of the property execInstancesReference.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecInstancesReference(String value) {
        this.execInstancesReference = value;
    }

    /**
     * Gets the value of the property subscriptionsReference.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubscriptionsReference() {
        return subscriptionsReference;
    }

    /**
     * Sets the value of the property subscriptionsReference.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubscriptionsReference(String value) {
        this.subscriptionsReference = value;
    }

    /**
     * Gets the value of the property id.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the property id.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
