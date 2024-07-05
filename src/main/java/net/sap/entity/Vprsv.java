package net.sap.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vprsv")
public class Vprsv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    
    @Column(name = "vprsv_code")
    private String vprsvCode;

    @Column(name = "vprsv_value")
    private String vprsvValue;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getVprsvCode() {
        return vprsvCode;
    }
    public void setVprsvCode(String vprsvCode) {
        this.vprsvCode = vprsvCode;
    }
    public String getVprsvValue() {
        return vprsvValue;
    }
    public void setVprsvValue(String vprsvValue) {
        this.vprsvValue = vprsvValue;
    }

    
}