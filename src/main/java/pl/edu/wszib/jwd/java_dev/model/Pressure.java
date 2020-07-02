package pl.edu.wszib.jwd.java_dev.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pressure")
public class Pressure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date")
    private Date date;

    @Column(name = "shrink")
    private double shrink;

    @Column(name = "diastole")
    private double diastole;

    @Column(name = "pulses")
    private double pulses;

    @Column(name = "type")
    private boolean type;

    @Column(name = "description")
    private String description;

    public Pressure() {
    }

    public Pressure(Date date, double shrink, double diastole, double pulses, boolean type, String description) {
        this.date = date;
        this.shrink = shrink;
        this.diastole = diastole;
        this.pulses = pulses;
        this.type = type;
        this.description = description;

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

    public double getShrink() {
        return shrink;
    }

    public void setShrink(double shrink) {
        this.shrink = shrink;
    }

    public double getDiastole() {
        return diastole;
    }

    public void setDiastole(double diastole) {
        this.diastole = diastole;
    }

    public double getPulses() {
        return pulses;
    }

    public void setPulses(double pulses) {
        this.pulses = pulses;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


