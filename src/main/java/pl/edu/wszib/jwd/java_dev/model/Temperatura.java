package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="temperatura")
public class Temperatura {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private Date data;
    private float temperatura;
    private String rodzaj;
    private String uwagi;

    public Temperatura() {
    }

//    tyczasowe do testow
    public Temperatura(Date data, float temperatura, String rodzaj, String uwagi) {
        this.data = data;
        this.temperatura = temperatura;
        this.rodzaj = rodzaj;
        this.uwagi = uwagi;
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

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
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