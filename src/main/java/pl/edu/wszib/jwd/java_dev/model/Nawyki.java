package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nawyki")
public class Nawyki {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data1;
    private Date data2;
    private String nazwa;
    private String powtorzenia;
    private String uwagi;
    private boolean realizacja;

    public Nawyki() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) {
        this.data1 = data1;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPowtorzenia() {
        return powtorzenia;
    }

    public void setPowtorzenia(String powtorzenia) {
        this.powtorzenia = powtorzenia;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public boolean isRealizacja() {
        return realizacja;
    }

    public void setRealizacja(boolean realizacja) {
        this.realizacja = realizacja;
    }
}
