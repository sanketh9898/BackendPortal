package com.employee.backend.repository;

import com.employee.backend.model.Allowance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Allowancerepository extends JpaRepository<Allowance, String>{

    public List<Allowance> findAll();

    public Allowance findById(Integer empId);
}

