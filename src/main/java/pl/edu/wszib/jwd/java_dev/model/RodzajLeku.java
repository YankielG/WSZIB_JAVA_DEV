package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;

@Entity
@Table(name = "rodzajleku")
public class RodzajLeku {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //    @NotEmpty(message = "*Pole nie może być puste!. Proszę o wypełnienie pola")
    private String rodzajleku;

    public RodzajLeku() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRodzajleku() {
        return rodzajleku;
    }

    public void setRodzajleku(String rodzajleku) {
        this.rodzajleku = rodzajleku;
    }
}
