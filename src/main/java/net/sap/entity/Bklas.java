package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bklas")
public class Bklas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bklas_code")
    private String bklasCode;
    @Column(name = "bklas_value")
    private String bklasValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBklasCode() {
        return bklasCode;
    }

    public void setBklasCode(String bklasCode) {
        this.bklasCode = bklasCode;
    }

    public String getBklasValue() {
        return bklasValue;
    }

    public void setBklasValue(String bklasValue) {
        this.bklasValue = bklasValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Bklas myObject = (Bklas) obj;
        return Objects.equals(this.bklasCode, myObject.getBklasCode());
            
    }

    @Override
    public int hashCode() {
        return Objects.hash(bklasCode, bklasValue);
    }
}