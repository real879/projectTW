package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Country")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = 30)
    private String name;

    //Country 1 --------->* Student
    @OneToMany(mappedBy = "country")
    private List<StudentEntity> students;

    //Country 1 ---------->- Teacher
    @OneToMany(mappedBy = "country")
    private List<TeacherEntity> teacher;

    public CountryEntity(int id, String name) {
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

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public List<TeacherEntity> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<TeacherEntity> teacher) {
        this.teacher = teacher;
    }
}
