package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "mbrsh")
public class Mbrsh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "mbrsh_code")
    private String mbrshCode;

    @Column(name = "mbrsh_value")
    private String mbrshValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMbrshCode() {
        return mbrshCode;
    }
    public void setMbrshCode(String mbrshCode) {
        this.mbrshCode = mbrshCode;
    }
    public String getMbrshValue() {
        return mbrshValue;
    }
    public void setMbrshValue(String mbrshValue) {
        this.mbrshValue = mbrshValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Mbrsh myObject = (Mbrsh) obj;
        return Objects.equals(mbrshCode, myObject.getMbrshCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbrshCode);
    }
}