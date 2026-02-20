package com.tr.demo.repositories;

import com.tr.demo.models.ProfModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<ProfModel, Long> {
}
