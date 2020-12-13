package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private int code;

    @Column(name="level")
    private int level;

    @Column(name = "name",length = 25)
    private String name;

    //course *-------> 1 Career
    @ManyToOne
    private CareerEntity career;

    //Course 1----------->* Section
    @OneToMany(mappedBy = "course")
    private List<SectionEntity> sections;

    public CourseEntity(Long id, int code, int level, String name) {
        this.id = id;
        this.code = code;
        this.level = level;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CareerEntity getCareer() {
        return career;
    }

    public void setCareer(CareerEntity career) {
        this.career = career;
    }

    public List<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(List<SectionEntity> sections) {
        this.sections = sections;
    }
}
