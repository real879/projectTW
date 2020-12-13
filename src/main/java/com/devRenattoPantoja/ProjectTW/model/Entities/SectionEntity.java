package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Section")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private int code;

    //Section *-------->1 Period
    @ManyToOne
    private PeriodEntity period;

    //Section *-------->1 Course
    @ManyToOne
    private CourseEntity course;

    //Sections *-------->* Student
    @ManyToMany(mappedBy = "sections")
    private List<StudentEntity> students;

    //SEction *---------->* Teacher
    @ManyToMany(mappedBy = "sections")
    private List<TeacherEntity> teachers;

    public SectionEntity(Long id, int code) {
        this.id = id;
        this.code = code;
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

    public PeriodEntity getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEntity period) {
        this.period = period;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }
}
