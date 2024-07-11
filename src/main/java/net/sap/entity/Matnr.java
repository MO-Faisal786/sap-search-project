package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "matnr")
public class Matnr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Matnr myObject = (Matnr) obj;
        return Objects.equals(matnrCode, myObject.getMatnrCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matnrCode);
    }
}