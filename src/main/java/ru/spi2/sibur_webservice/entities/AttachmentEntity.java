//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STG_Attachment")
public class AttachmentEntity extends BaseEntity {

    protected String attachmentType;
    protected String attachmentName;
    protected String fileName;
    protected String fileExtension;

    protected byte[] attachmentBody;

    /**
     * Gets the value of the attachmentType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * Sets the value of the attachmentType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttachmentType(String value) {
        this.attachmentType = value;
    }

    /**
     * Gets the value of the attachmentName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileExtension property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the attachmentBody property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getAttachmentBody() {
        return attachmentBody;
    }

    /**
     * Sets the value of the attachmentBody property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setAttachmentBody(byte[] value) {
        this.attachmentBody = value;
    }

}
