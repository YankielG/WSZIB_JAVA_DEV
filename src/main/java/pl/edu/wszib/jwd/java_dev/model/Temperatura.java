package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "temperatura")
public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//        @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//        @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
     private Date data;
//        @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//    @NumberFormat(pattern = "#,###,###,###.##")
    private double temperatura;
    private boolean rodzaj;
    private String uwagi;

    //    tyczasowe do testow
    public Temperatura(Date data, double temperatura, boolean rodzaj, String uwagi) {
        this.data = data;
        this.temperatura = temperatura;
        this.rodzaj = rodzaj;
        this.uwagi = uwagi;
    }

    public Temperatura() {

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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
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
