package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "index")
public class Index {

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
    //    private Date data = new Date();
    //    private LocalDateTime data = LocalDateTime.now();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik")
    private String uzytkownik;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_id")
    private Long uzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_prawa")
    private String uzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "dane_opcje")
    private boolean dane_opcje;

    public Index() {
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

    public String getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(String uzytkownik) {
        this.uzytkownik = uzytkownik;
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
