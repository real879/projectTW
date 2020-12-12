package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "names",length = 50)
    private String names;

    @Column(name = "last_names",length = 50)
    private String last_names;

    @Column(name = "email",length = 50)
    private String email;

    @Column(name = "personal_email",length = 50)
    private String personal_email;

    @Column(name = "url_photo",length = 100)
    private String url_photo;

    //Teacher *---------->1 Gender
    @ManyToOne
    private GenderEntity gender;

    //Teacher *---------->1 country
    @ManyToOne
    private CountryEntity country;

    //Teacher *----------->1 TeacherType
    @ManyToOne
    private TeacherTypeEntity teacherType;

    //Teacher *----------->* Section
    @ManyToMany
    private List<SectionEntity> sections;

    public TeacherEntity(int id, int code, String names, String last_names, String email, String personal_email, String url_photo) {
        this.id = id;
        this.code = code;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.personal_email = personal_email;
        this.url_photo = url_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public TeacherTypeEntity getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherTypeEntity teacherType) {
        this.teacherType = teacherType;
    }

    public List<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(List<SectionEntity> sections) {
        this.sections = sections;
    }
}
