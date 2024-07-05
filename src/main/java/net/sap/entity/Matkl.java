package net.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matkl")
public class Matkl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    
    @Column(name = "matkl_code")
    private String ekgrpCode;

    @Column(name = "matkl_value")
    private String matklValue;

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
    public String getMatklValue() {
        return matklValue;
    }
    public void setMatklValue(String matklValue) {
        this.matklValue = matklValue;
    }

    
}