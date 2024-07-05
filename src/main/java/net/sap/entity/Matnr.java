package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matnr")
public class Matnr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "matnr_code")
    private String matnrCode;

    @Column(name = "matnr_value")
    private String matnrValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatnrCode() {
        return matnrCode;
    }

    public void setMatnrCode(String matnrCode) {
        this.matnrCode = matnrCode;
    }

    public String getMatnrValue() {
        return matnrValue;
    }

    public void setMatnrValue(String matnrValue) {
        this.matnrValue = matnrValue;
    }

    
}