package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Gender")
public class GenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 15)
    private String name;

    // Gender 1 -----------> * Student
    @OneToMany(mappedBy = "gender")
    private List<StudentEntity> students;

    // Gender 1 ------------> * Teacher
    @OneToMany(mappedBy = "gender")
    private List<TeacherEntity> teacher;

    public GenderEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
