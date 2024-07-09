package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "maktx")
public class Maktx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "maktx_code")
    private String maktxCode;

    @Column(name = "maktx_value")
    private String maktxValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaktxCode() {
        return maktxCode;
    }

    public void setMaktxCode(String maktxCode) {
        this.maktxCode = maktxCode;
    }

    public String getMaktxValue() {
        return maktxValue;
    }

    public void setMaktxValue(String maktxValue) {
        this.maktxValue = maktxValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Maktx myObject = (Maktx) obj;
        return Objects.equals(maktxCode, myObject.getMaktxCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(maktxCode, maktxValue);
    }
}