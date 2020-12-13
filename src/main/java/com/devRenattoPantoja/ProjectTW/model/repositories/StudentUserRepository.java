package com.devRenattoPantoja.ProjectTW.model.repositories;

import com.devRenattoPantoja.ProjectTW.model.Entities.StudentUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface StudentUserRepository extends JpaRepository<StudentUserEntity,Long> {
    Optional<StudentUserEntity> findByUsername(String username);
}
