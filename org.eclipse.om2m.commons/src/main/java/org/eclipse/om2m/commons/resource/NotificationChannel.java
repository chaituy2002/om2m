//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.24 at 02:41:52 AM CEST
//


package org.eclipse.om2m.commons.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java Class for NotificationChannel complex type.
 *
 * <p>NotificationChannel resource is used by non-server capable client to receive asynchronous notifications.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NotificationChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}channelType" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}contactURI" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}channelData" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}creationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}lastModifiedTime" minOccurs="0"/>
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
public class NotificationChannel extends Resource {

    protected ChannelType channelType;
    @XmlSchemaType(name = "anyURI")
    protected String contactURI;
    protected ChannelData channelData;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlAttribute(name = "id", namespace = "http://uri.etsi.org/m2m")
    @XmlSchemaType(name = "anyURI")
    protected String id;

    /**
     * Gets the value of the property channelType.
     *
     * @return
     *     possible object is
     *     {@link ChannelType }
     *
     */
    public ChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the property channelType.
     *
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *
     */
    public void setChannelType(ChannelType value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the property contactURI.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactURI() {
        return contactURI;
    }

    /**
     * Sets the value of the property contactURI.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactURI(String value) {
        this.contactURI = value;
    }

    /**
     * Gets the value of the property channelData.
     *
     * @return
     *     possible object is
     *     {@link ChannelData }
     *
     */
    public ChannelData getChannelData() {
        return channelData;
    }

    /**
     * Sets the value of the property channelData.
     *
     * @param value
     *     allowed object is
     *     {@link ChannelData }
     *
     */
    public void setChannelData(ChannelData value) {
        this.channelData = value;
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
