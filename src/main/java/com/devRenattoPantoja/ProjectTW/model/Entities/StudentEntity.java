package com.devRenattoPantoja.ProjectTW.model.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private int code;

    @Column(name = "name",length = 50)
    private String name;

    @Column(name = "last_name",length = 50)
    private String last_name;

    @Column(name = "email",length = 50)
    private String email;

    @Column(name = "personal_email",length = 50)
    private String personal_email;

    @Column(name = "url_photo",length = 100)
    private String url_photo;

    //Student *---------->1 Gender
    @ManyToOne
    private GenderEntity gender;

    //Student *----------->1 Career
    @ManyToOne
    private CareerEntity career;

    //Student *----------->1 Country
    @ManyToOne
    private CountryEntity country;

    // Student *----------->* Section
    @ManyToMany
    private List<SectionEntity> sections;

    //Student 1----------->1 StudentUser
    @OneToOne(mappedBy = "student")
    private StudentUserEntity studentUser;

    public StudentEntity(Long id, int code, String name, String last_name, String email, String personal_email, String url_photo) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.personal_email = personal_email;
        this.url_photo = url_photo;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public CareerEntity getCareer() {
        return career;
    }

    public void setCareer(CareerEntity career) {
        this.career = career;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public List<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(List<SectionEntity> sections) {
        this.sections = sections;
    }

    public StudentUserEntity getStudentUser() {
        return studentUser;
    }

    public void setStudentUser(StudentUserEntity studentUser) {
        this.studentUser = studentUser;
    }
}
