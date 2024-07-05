package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mbrsh")
public class Mbrsh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "mbrsh_code")
    private String mbrshCode;

    @Column(name = "mbrsh_value")
    private String mbrshValue;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getMbrshCode() {
        return mbrshCode;
    }
    public void setMbrshCode(String mbrshCode) {
        this.mbrshCode = mbrshCode;
    }
    public String getMbrshValue() {
        return mbrshValue;
    }
    public void setMbrshValue(String mbrshValue) {
        this.mbrshValue = mbrshValue;
    }

    
}