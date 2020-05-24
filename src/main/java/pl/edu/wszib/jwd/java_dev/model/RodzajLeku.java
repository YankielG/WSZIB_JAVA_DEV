package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;

@Entity
@Table(name = "rodzajleku")
public class RodzajLeku {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//    @Column(name = "rodzajleku_nazwa")
    private String rodzajleku_;

//    private Date data;
    //    private LocalDateTime data = LocalDateTime.now();

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_id")
    private Long uzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_prawa")
    private String uzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "dane_opcje")
    private boolean dane_opcje;

    public RodzajLeku() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRodzajleku_() {
        return rodzajleku_;
    }

    public void setRodzajleku_(String rodzajleku_) {
        this.rodzajleku_ = rodzajleku_;
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
