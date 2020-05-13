package ru.spi2.sibur_webservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import java.util.Date;

@Entity
public class RequestDataInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ", allocationSize = 1)
    private Long id;

    private Date createDate;


    private String seviceMethodName;

    @Lob
    private String xmlBody;

    public RequestDataInfo() {
    }

    public RequestDataInfo(Date createDate, String seviceMethodName, String xmlBody) {
        this.createDate = createDate;
        this.seviceMethodName = seviceMethodName;
        this.xmlBody = xmlBody;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
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
