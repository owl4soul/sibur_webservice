//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:39:49 PM MSK 
//


package ru.spi2.sibur_webservice.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "STG_ContractPerson")
public class ContractPersonEntity extends BaseEntity {

    @ManyToOne(cascade = PERSIST)
    @JoinColumn(name = "ROLE_ID")
    protected DictionaryEntity role;

    /**
     * Справочник сотрудников - 100 тыс.
     **/
    @ManyToOne(cascade = PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected EmployeeEntity employeeEntity;

    @ManyToOne(cascade = PERSIST)
    @JoinColumn(name = "FUNCTTION_ID")
    protected DictionaryEntity function;


    /**
     * Gets the value of the role property.
     *
     * @return possible object is
     * {@link DictionaryEntity }
     */
    public DictionaryEntity getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value allowed object is
     *              {@link DictionaryEntity }
     */
    public void setRole(DictionaryEntity value) {
        this.role = value;
    }

    /**
     * Gets the value of the employeeEntity property.
     *
     * @return possible object is
     * {@link EmployeeEntity }
     */
    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    /**
     * Sets the value of the employeeEntity property.
     *
     * @param value allowed object is
     *              {@link EmployeeEntity }
     */
    public void setEmployeeEntity(EmployeeEntity value) {
        this.employeeEntity = value;
    }

    /**
     * Gets the value of the function property.
     *
     * @return possible object is
     * {@link DictionaryEntity }
     */
    public DictionaryEntity getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     *
     * @param value allowed object is
     *              {@link DictionaryEntity }
     */
    public void setFunction(DictionaryEntity value) {
        this.function = value;
    }

}