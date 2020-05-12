package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "start")
public class Start {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data;
    private String urzytkownik;

    public Start() {
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

    public String getUrzytkownik() {
        return urzytkownik;
    }

    public void setUrzytkownik(String urzytkownik) {
        this.urzytkownik = urzytkownik;
    }
}
