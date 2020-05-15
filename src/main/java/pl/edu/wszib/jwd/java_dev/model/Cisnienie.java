package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cisnienie")
public class Cisnienie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double skurcz;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double rozkurcz;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double tetno;
    private boolean rodzaj;
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

    public double getTetno() {
        return tetno;
    }

    public void setTetno(double tetno) {
        this.tetno = tetno;
    }

    public boolean isRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(boolean rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
