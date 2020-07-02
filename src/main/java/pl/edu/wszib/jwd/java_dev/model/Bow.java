package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bow")
public class Bow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date")
    private Date date;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "bows")
    private String bows;

    public Bow() {
    }

    public Bow( Date date, String quantity, String type, String description, String bows) {
        this.date = date;
        this.quantity = quantity;
        this.type = type;
        this.description = description;
        this.bows = bows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBows() {
        return bows;
    }

    public void setBows(String bows) {
        this.bows = bows;
    }
}
