package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "ekgrp")
public class Ekgrp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Ekgrp myObject = (Ekgrp) obj;
        return Objects.equals(ekgrpCode, myObject.getEkgrpCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ekgrpCode, ekgrpValue);
    }


}