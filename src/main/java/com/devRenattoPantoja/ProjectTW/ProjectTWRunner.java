package com.devRenattoPantoja.ProjectTW;

import com.devRenattoPantoja.ProjectTW.model.Entities.CareerEntity;
import com.devRenattoPantoja.ProjectTW.model.Entities.StudentUserEntity;
import com.devRenattoPantoja.ProjectTW.model.Entities.TeacherUserEntity;
import com.devRenattoPantoja.ProjectTW.model.repositories.CareerRepository;
import com.devRenattoPantoja.ProjectTW.model.repositories.StudentUserRepository;
import com.devRenattoPantoja.ProjectTW.model.repositories.TeacherUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProjectTWRunner implements CommandLineRunner {

    @Autowired
    private CareerRepository career;

    @Autowired
    private StudentUserRepository student_user;

    @Autowired
    private TeacherUserRepository teacher_user;

    @Override
    public void run(String... args) throws Exception {
        /*StudentUserEntity userStudent1= new StudentUserEntity(null,"20162365","qwerty",
                "12345","12345");

        student_user.save(userStudent1);

        TeacherUserEntity userTeacher1= new TeacherUserEntity(null,"rjpantoj","12345",
                "12345","12345");

        teacher_user.save(userTeacher1);
        System.out.println("Se grabo con exito");

        CareerEntity career1 = new CareerEntity(null,"Ingenieria de Sistemas");
        career.save(career1);*/

        Optional<StudentUserEntity> student = student_user.findByUsername("20162365");
        if (student.isPresent()){
            System.out.println("user: "+student.get().getUsername());
            System.out.println("pass: "+ student.get().getPassword());
        }else{
            System.out.println("no se encontro usuario");
        }

    }
}
