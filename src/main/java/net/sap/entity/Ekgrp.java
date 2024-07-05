package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ekgrp")
public class Ekgrp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    
    @Column(name = "ekgrp_code")
    private String ekgrpCode;

    @Column(name = "ekgrp_value")
    private String ekgrpValue;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEkgrpCode() {
        return ekgrpCode;
    }
    public void setEkgrpCode(String ekgrpCode) {
        this.ekgrpCode = ekgrpCode;
    }
    public String getEkgrpValue() {
        return ekgrpValue;
    }
    public void setEkgrpValue(String ekgrpValue) {
        this.ekgrpValue = ekgrpValue;
    }
   


}