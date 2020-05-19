package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cisnienie")
public class Cisnienie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    //    @Temporal(TemporalType.DATE)
    //    @Column(name = "data", updatable = false, nullable = false)
    //    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data")
    private Date data;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double skurcz;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double rozkurcz;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private double tetno;

    private boolean rodzaj;

    private String uwagi;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik_id")
    private Long urzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik_prawa")
    private String urzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "dane_opcje")
    private boolean dane_opcje;

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

    public Long getUrzytkownik_id() {
        return urzytkownik_id;
    }

    public void setUrzytkownik_id(Long urzytkownik_id) {
        this.urzytkownik_id = urzytkownik_id;
    }

    public String getUrzytkownik_prawa() {
        return urzytkownik_prawa;
    }

    public void setUrzytkownik_prawa(String urzytkownik_prawa) {
        this.urzytkownik_prawa = urzytkownik_prawa;
    }

    public boolean isDane_opcje() {
        return dane_opcje;
    }

    public void setDane_opcje(boolean dane_opcje) {
        this.dane_opcje = dane_opcje;
    }
}


