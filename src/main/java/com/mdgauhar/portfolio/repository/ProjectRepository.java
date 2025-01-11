package com.mdgauhar.portfolio.repository;

import com.mdgauhar.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

