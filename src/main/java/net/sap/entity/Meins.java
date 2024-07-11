package net.sap.entity;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "meins")
public class Meins {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "meins_code")
    private String meinsCode;

    @Column(name = "meins_value")
    private String meinsValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeinsCode() {
        return meinsCode;
    }
    public void setMeinsCode(String meinsCode) {
        this.meinsCode = meinsCode;
    }
    public String getMeinsValue() {
        return meinsValue;
    }
    public void setMeinsValue(String meinsValue) {
        this.meinsValue = meinsValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Meins myObject = (Meins) obj;
        return Objects.equals(meinsCode, myObject.getMeinsCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(meinsCode);
    }
}