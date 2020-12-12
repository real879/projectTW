package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Career")
public class CareerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = 25)
    private String name;

    //career 1---->* courses
    @OneToMany(mappedBy = "career")
    private List<CourseEntity> courses;

    public CareerEntity(int id, String name) {
        this.id = id;
        this.name = name;
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
}
