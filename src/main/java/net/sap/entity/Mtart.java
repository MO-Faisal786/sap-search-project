package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "mtart")
public class Mtart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Mtart myObject = (Mtart) obj;
        return Objects.equals(mtartCode, myObject.getMtartCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(mtartCode);
    }
}