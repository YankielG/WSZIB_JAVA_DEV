package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wzrost")
public class Wzrost {

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
//    private LocalDateTime data = LocalDateTime.now();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//    private double wzrost_=180;
    private double wzrost_;

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

    public Wzrost() {
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

    public double getWzrost_() {
        return wzrost_;
    }

    public void setWzrost_(double wzrost_) {
        this.wzrost_ = wzrost_;
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
