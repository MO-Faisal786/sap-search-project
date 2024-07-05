package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mtart")
public class Mtart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    
    @Column(name = "mtart_code")
    private String mtartCode;

    @Column(name = "mtart_value")
    private String mtartValue;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMtartCode() {
        return mtartCode;
    }
    public void setMtartCode(String mtartCode) {
        this.mtartCode = mtartCode;
    }
    public String getMtartValue() {
        return mtartValue;
    }
    public void setMtartValue(String mtartValue) {
        this.mtartValue = mtartValue;
    }
    

    
}