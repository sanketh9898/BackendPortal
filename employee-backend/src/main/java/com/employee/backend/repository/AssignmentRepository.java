package com.employee.backend.repository;

import com.employee.backend.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AssignmentRepository extends JpaRepository<Assignments, String> {

    public List<Assignments> findAll();

    public Assignments findById(Integer empId);
}


