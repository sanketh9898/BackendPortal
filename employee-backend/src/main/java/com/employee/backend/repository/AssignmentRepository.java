package com.employee.backend.repository;

import com.employee.backend.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AssignmentRepository extends JpaRepository<Assignments, Integer> {

    public List<Assignments> findAll();

    public Assignments findByEmpId(Integer empId);

    Assignments save(Assignments assign);
}


