package net.sap.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "meins")
public class Meins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
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

    
}