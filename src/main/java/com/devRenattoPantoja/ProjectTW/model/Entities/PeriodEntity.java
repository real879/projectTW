package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Period")
public class PeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = 7)
    private String name;

    @Column(name = "year")
    private int year;

    //Period 1---------->* Section
    @OneToMany(mappedBy = "period")
    private List<SectionEntity> sections;

    public PeriodEntity(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(List<SectionEntity> sections) {
        this.sections = sections;
    }
}
