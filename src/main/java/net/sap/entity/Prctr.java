package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prctr")
public class Prctr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    
    @Column(name = "prctr_code")
    private String prctrCode;

    @Column(name = "prctr_value")
    private String prctrValue;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrctrCode() {
        return prctrCode;
    }
    public void setPrctrCode(String prctrCode) {
        this.prctrCode = prctrCode;
    }
    public String getPrctrValue() {
        return prctrValue;
    }
    public void setPrctrValue(String prctrValue) {
        this.prctrValue = prctrValue;
    }

    
}