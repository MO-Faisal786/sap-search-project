package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dismm")
public class Dismm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "dismm_code")
    private String dismmCode;

    @Column(name = "dismm_value")
    private String dismmValue;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDismmCode() {
        return dismmCode;
    }
    public void setDismmCode(String dismmCode) {
        this.dismmCode = dismmCode;
    }
    public String getDismmValue() {
        return dismmValue;
    }
    public void setDismmValue(String dismmValue) {
        this.dismmValue = dismmValue;
    }
    
}