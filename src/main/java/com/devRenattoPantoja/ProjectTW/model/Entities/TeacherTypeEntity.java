package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TeacherType")
public class TeacherTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = 20)
    private String name;

    //TeacherType 1 ----------->* Teacher
    @OneToMany(mappedBy = "teacherType")
    private List<TeacherEntity> teachers;

    public TeacherTypeEntity(int id, String name) {
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

    public List<TeacherEntity> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherEntity> teachers) {
        this.teachers = teachers;
    }
}
