package com.employee.backend.repository;

import com.employee.backend.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, String> {

    Skills findById(Integer empId);

}
