package ru.spi2.sibur_webservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class RequestDataInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ", allocationSize = 1)
    private Long id;

    private String createDate;

    private String seviceMethodName;

    @Column(length = 4000)
    private String xmlBody;

    public RequestDataInfo() {
    }

    public RequestDataInfo(String createDate, String seviceMethodName, String xmlBody) {
        this.createDate = createDate;
        this.seviceMethodName = seviceMethodName;
        this.xmlBody = xmlBody;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getSeviceMethodName() {
        return seviceMethodName;
    }

    public void setSeviceMethodName(String seviceMethodName) {
        this.seviceMethodName = seviceMethodName;
    }

    public String getXmlBody() {
        return xmlBody;
    }

    public void setXmlBody(String xmlBody) {
        this.xmlBody = xmlBody;
    }
}
