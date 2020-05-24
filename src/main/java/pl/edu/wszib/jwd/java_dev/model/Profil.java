package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "profil")
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik")
    private String urzytkownik;

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
    @Column(name = "urzytkownik_aktywny")
    private Boolean urzytkownik_aktywny;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik_id")
    private Long urzytkownik_id;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik_prawa")
    private String urzytkownik_prawa;

    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    @Column(name = "urzytkownik_uwagi")
    private String urzytkownik_uwagi;

    //    Data tworzenia urzytkownika
//    @Temporal(TemporalType.DATE)
//    @Column(name = "urzytkownik_d_tw", updatable = false, nullable = false)
    @Column(name = "urzytkownik_d_tw")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date urzytkownik_data_tw;
        private LocalDateTime urzytkownik_data_tw = LocalDateTime.now();

    //    Data ostatniej edycji
//    @Temporal(TemporalType.DATE)
//    @Column(name = "urzytkownik_d_up", updatable = false, nullable = false)
    @Column(name = "urzytkownik_d_up")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date urzytkownik_data_up;
    //    private LocalDateTime data = LocalDateTime.now();

    //    Data usuniecia profilu
//    @Temporal(TemporalType.DATE)
//    @Column(name = "urzytkownik_d_cl", updatable = false, nullable = false)
    @Column(name = "urzytkownik_d_cl")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date urzytkownik_data_ucl;
    //    private LocalDateTime data = LocalDateTime.now();

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

    public String getUrzytkownik() {
        return urzytkownik;
    }

    public void setUrzytkownik(String urzytkownik) {
        this.urzytkownik = urzytkownik;
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

    public Boolean getUrzytkownik_aktywny() {
        return urzytkownik_aktywny;
    }

    public void setUrzytkownik_aktywny(Boolean urzytkownik_aktywny) {
        this.urzytkownik_aktywny = urzytkownik_aktywny;
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

    public String getUrzytkownik_uwagi() {
        return urzytkownik_uwagi;
    }

    public void setUrzytkownik_uwagi(String urzytkownik_uwagi) {
        this.urzytkownik_uwagi = urzytkownik_uwagi;
    }

    public LocalDateTime getUrzytkownik_data_tw() {
        return urzytkownik_data_tw;
    }

    public void setUrzytkownik_data_tw(LocalDateTime urzytkownik_data_tw) {
        this.urzytkownik_data_tw = urzytkownik_data_tw;
    }

    public Date getUrzytkownik_data_up() {
        return urzytkownik_data_up;
    }

    public void setUrzytkownik_data_up(Date urzytkownik_data_up) {
        this.urzytkownik_data_up = urzytkownik_data_up;
    }

    public Date getUrzytkownik_data_ucl() {
        return urzytkownik_data_ucl;
    }

    public void setUrzytkownik_data_ucl(Date urzytkownik_data_ucl) {
        this.urzytkownik_data_ucl = urzytkownik_data_ucl;
    }

    public boolean isDane_opcje() {
        return dane_opcje;
    }

    public void setDane_opcje(boolean dane_opcje) {
        this.dane_opcje = dane_opcje;
    }
}
