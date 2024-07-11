package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "prctr")
public class Prctr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Prctr myObject = (Prctr) obj;
        return Objects.equals(prctrCode, myObject.getPrctrCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(prctrCode);
    }
}