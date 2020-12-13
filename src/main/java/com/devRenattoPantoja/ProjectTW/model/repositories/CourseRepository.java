package com.devRenattoPantoja.ProjectTW.model.repositories;

import com.devRenattoPantoja.ProjectTW.model.Entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
