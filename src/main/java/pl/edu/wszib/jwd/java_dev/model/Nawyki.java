package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nawyki")
public class Nawyki {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    //    @Temporal(TemporalType.DATE)
    //    @Column(name = "data", updatable = false, nullable = false)
    //    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data1")
    private Date data1;
    //    private Date data = new Date();
    //    private LocalDateTime data = LocalDateTime.now();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    //    @Temporal(TemporalType.DATE)
    //    @Column(name = "data", updatable = false, nullable = false)
    //    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data2")
    private Date data2;
    //    private Date data = new Date();
    //    private LocalDateTime data = LocalDateTime.now();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "nazwa")
    private String nazwa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "powtorzenia")
    private String powtorzenia;

    @Column(name = "uwagi")
    private String uwagi;

    @Column(name = "realizacja")
    private boolean realizacja;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_id")
    private Long uzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_prawa")
    private String uzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "dane_opcje")
    private boolean dane_opcje;

    public Nawyki() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) {
        this.data1 = data1;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPowtorzenia() {
        return powtorzenia;
    }

    public void setPowtorzenia(String powtorzenia) {
        this.powtorzenia = powtorzenia;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public boolean isRealizacja() {
        return realizacja;
    }

    public void setRealizacja(boolean realizacja) {
        this.realizacja = realizacja;
    }

    public Long getUzytkownik_id() {
        return uzytkownik_id;
    }

    public void setUzytkownik_id(Long uzytkownik_id) {
        this.uzytkownik_id = uzytkownik_id;
    }

    public String getUzytkownik_prawa() {
        return uzytkownik_prawa;
    }

    public void setUzytkownik_prawa(String uzytkownik_prawa) {
        this.uzytkownik_prawa = uzytkownik_prawa;
    }

    public boolean isDane_opcje() {
        return dane_opcje;
    }

    public void setDane_opcje(boolean dane_opcje) {
        this.dane_opcje = dane_opcje;
    }
}
