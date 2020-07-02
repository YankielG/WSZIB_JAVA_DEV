package pl.edu.wszib.jwd.java_dev.model;

import javax.persistence.*;

@Entity
@Table(name = "bowtype")
public class BowType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "bowtypes")
    private String bowtypes;

    public BowType() {
    }

    public BowType(String bowtypes) {
        this.bowtypes = bowtypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBowtypes() {
        return bowtypes;
    }

    public void setBowtypes(String bowtypes) {
        this.bowtypes = bowtypes;
    }
}
