package net.sap.entity;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "vprsv")
public class Vprsv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vprsv myObject = (Vprsv) obj;
        return Objects.equals(vprsvCode, myObject.getVprsvCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(vprsvCode);
    }
}