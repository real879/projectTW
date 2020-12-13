package com.devRenattoPantoja.ProjectTW.model.repositories;

import com.devRenattoPantoja.ProjectTW.model.Entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
}
