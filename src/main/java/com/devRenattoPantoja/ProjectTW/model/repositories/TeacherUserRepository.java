package com.devRenattoPantoja.ProjectTW.model.repositories;

import com.devRenattoPantoja.ProjectTW.model.Entities.TeacherUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherUserRepository extends JpaRepository<TeacherUserEntity,Long> {
}
