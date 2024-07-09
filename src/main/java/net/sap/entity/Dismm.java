package net.sap.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "dismm")
public class Dismm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "dismm_code")
    private String dismmCode;

    @Column(name = "dismm_value")
    private String dismmValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDismmCode() {
        return dismmCode;
    }
    public void setDismmCode(String dismmCode) {
        this.dismmCode = dismmCode;
    }
    public String getDismmValue() {
        return dismmValue;
    }
    public void setDismmValue(String dismmValue) {
        this.dismmValue = dismmValue;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Dismm myObject = (Dismm) obj;
        return Objects.equals(dismmCode, myObject.getDismmCode());
            
    }

    @Override
    public int hashCode() {
        return Objects.hash(dismmCode, dismmValue);
    }
}