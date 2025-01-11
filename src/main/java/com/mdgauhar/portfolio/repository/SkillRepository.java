package com.mdgauhar.portfolio.repository;

import com.mdgauhar.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}

