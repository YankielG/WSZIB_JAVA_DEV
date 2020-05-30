package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "profil")
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wybor")
    private boolean wybor;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik")
    private String uzytkownik;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "imie")
    private String imie;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "nazwisko")
    private String nazwisko;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "email")
    private String email;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "haslo")
    private String haslo;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "plec")
    private String plec;

    //    Data urodzenia
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    //    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data")
    private Date data;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "waga")
    private String waga;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "miara")
    private String miara;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_aktywny")
    private Boolean uzytkownik_aktywny;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_id")
    private Long uzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_prawa")
    private String uzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_typ")
    private String uzytkownik_typ;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "uzytkownik_uwagi")
    private String uzytkownik_uwagi;

    //    Data tworzenia uzytkownika
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_tw", updatable = false, nullable = false)
    @Column(name = "uzytkownik_d_tw")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date uzytkownik_data_tw;
//    private LocalDateTime uzytkownik_data_tw = LocalDateTime.now();
//    private Date uzytkownik_data_tw = new Date();

    //    Data ostatniej edycji
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_up", updatable = false, nullable = false)
    @Column(name = "uzytkownik_d_up")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uzytkownik_data_up;

    //    Data usuniecia profilu
//    @Temporal(TemporalType.DATE)
//    @Column(name = "uzytkownik_d_cl", updatable = false, nullable = false)
    @Column(name = "uzytkownik_d_cl")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uzytkownik_data_ucl;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "dane_opcje")
    private boolean dane_opcje;

    public Profil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWybor() {
        return wybor;
    }

    public void setWybor(boolean wybor) {
        this.wybor = wybor;
    }

    public String getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(String uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getWaga() {
        return waga;
    }

    public void setWaga(String waga) {
        this.waga = waga;
    }

    public String getMiara() {
        return miara;
    }

    public void setMiara(String miara) {
        this.miara = miara;
    }

    public Boolean getUzytkownik_aktywny() {
        return uzytkownik_aktywny;
    }

    public void setUzytkownik_aktywny(Boolean uzytkownik_aktywny) {
        this.uzytkownik_aktywny = uzytkownik_aktywny;
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

    public String getUzytkownik_typ() {
        return uzytkownik_typ;
    }

    public void setUzytkownik_typ(String uzytkownik_typ) {
        this.uzytkownik_typ = uzytkownik_typ;
    }

    public String getUzytkownik_uwagi() {
        return uzytkownik_uwagi;
    }

    public void setUzytkownik_uwagi(String uzytkownik_uwagi) {
        this.uzytkownik_uwagi = uzytkownik_uwagi;
    }

    public Date getUzytkownik_data_tw() {
        return uzytkownik_data_tw;
    }

    public void setUzytkownik_data_tw(Date uzytkownik_data_tw) {
        this.uzytkownik_data_tw = uzytkownik_data_tw;
    }

    public Date getUzytkownik_data_up() {
        return uzytkownik_data_up;
    }

    public void setUzytkownik_data_up(Date uzytkownik_data_up) {
        this.uzytkownik_data_up = uzytkownik_data_up;
    }

    public Date getUzytkownik_data_ucl() {
        return uzytkownik_data_ucl;
    }

    public void setUzytkownik_data_ucl(Date uzytkownik_data_ucl) {
        this.uzytkownik_data_ucl = uzytkownik_data_ucl;
    }

    public boolean isDane_opcje() {
        return dane_opcje;
    }

    public void setDane_opcje(boolean dane_opcje) {
        this.dane_opcje = dane_opcje;
    }
}
