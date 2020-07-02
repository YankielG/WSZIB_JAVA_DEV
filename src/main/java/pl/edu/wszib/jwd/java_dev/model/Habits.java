package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "habits")
public class Habits {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date1")
    private Date date1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date2")
    private Date date2;

    @Column(name = "name")
    private String name;

    @Column(name = "repeat")
    private String repeat;

    @Column(name = "description")
    private String description;

    @Column(name = "implementation")
    private boolean implementation;

    public Habits() {
    }

    public Habits(Date date1, Date date2, String name, String repeat, String description, boolean implementation) {
        this.date1 = date1;
        this.date2 = date2;
        this.name = name;
        this.repeat = repeat;
        this.description = description;
        this.implementation = implementation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isImplementation() {
        return implementation;
    }

    public void setImplementation(boolean implementation) {
        this.implementation = implementation;
    }
}
