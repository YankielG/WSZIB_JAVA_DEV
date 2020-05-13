package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "waga")
public class Waga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data;
    private double waga;
    private boolean rodzaj;
    private String uwagi;

    public Waga() {
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

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
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
