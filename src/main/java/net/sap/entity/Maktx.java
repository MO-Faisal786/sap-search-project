package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maktx")
public class Maktx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "maktx_code")
    private String maktxCode;

    @Column(name = "maktx_value")
    private String maktxValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaktxCode() {
        return maktxCode;
    }

    public void setMaktxCode(String maktxCode) {
        this.maktxCode = maktxCode;
    }

    public String getMaktxValue() {
        return maktxValue;
    }

    public void setMaktxValue(String maktxValue) {
        this.maktxValue = maktxValue;
    }

    
}