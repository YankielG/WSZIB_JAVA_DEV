package pl.edu.wszib.jwd.java_dev.model;

import java.util.Date;

public class Leki {
    private Long id;
    private Date data;
    private String lek;
    private String dawka;
    private String rodzaj;
    private String uwagi;

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

    public String getLek() {
        return lek;
    }

    public void setLek(String lek) {
        this.lek = lek;
    }

    public String getDawka() {
        return dawka;
    }

    public void setDawka(String dawka) {
        this.dawka = dawka;
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
