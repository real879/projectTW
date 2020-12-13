package com.devRenattoPantoja.ProjectTW.model.repositories;

import com.devRenattoPantoja.ProjectTW.model.Entities.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<GenderEntity,Long> {
}
