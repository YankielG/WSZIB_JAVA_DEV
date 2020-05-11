package pl.edu.wszib.jwd.java_dev.model;

import java.util.Date;

public class Profil {
    private Long id;
    private String urzytkownik;
    private String imie;
    private String nazwisko;
    private String plec;
    private Date dataurodzenia;
    private String jednostkawagi;
    private String jednostkamiar;

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

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public Date getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(Date dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public String getJednostkawagi() {
        return jednostkawagi;
    }

    public void setJednostkawagi(String jednostkawagi) {
        this.jednostkawagi = jednostkawagi;
    }

    public String getJednostkamiar() {
        return jednostkamiar;
    }

    public void setJednostkamiar(String jednostkamiar) {
        this.jednostkamiar = jednostkamiar;
    }
}
