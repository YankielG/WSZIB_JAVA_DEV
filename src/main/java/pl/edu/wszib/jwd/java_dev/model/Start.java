package pl.edu.wszib.jwd.java_dev.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "start")
public class Start {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date data;
//    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private String urzytkownik;

    public Start() {
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
}
