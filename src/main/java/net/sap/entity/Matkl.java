package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "matkl")
public class Matkl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "matkl_code")
    private String matklCode;

    @Column(name = "matkl_value")
    private String matklValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatklCode() {
        return matklCode;
    }

    public void setMatklCode(String matklCode) {
        this.matklCode = matklCode;
    }

    public String getMatklValue() {
        return matklValue;
    }

    public void setMatklValue(String matklValue) {
        this.matklValue = matklValue;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
            Matkl myObject = (Matkl) obj;
        return Objects.equals(matklCode, myObject.getMatklCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matklCode);
    }
}