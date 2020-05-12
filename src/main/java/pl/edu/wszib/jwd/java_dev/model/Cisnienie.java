package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cisnienie")
public class Cisnienie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data;
    private double skurcz;
    private double rozkurcz;
    private double tentno;
    private String rodzaj;
    private String uwagi;

    public Cisnienie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSkurcz() {
        return skurcz;
    }

    public void setSkurcz(double skurcz) {
        this.skurcz = skurcz;
    }

    public double getRozkurcz() {
        return rozkurcz;
    }

    public void setRozkurcz(double rozkurcz) {
        this.rozkurcz = rozkurcz;
    }

    public double getTentno() {
        return tentno;
    }

    public void setTentno(double tentno) {
        this.tentno = tentno;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
