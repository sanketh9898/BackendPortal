package com.employee.backend.repository;

import com.employee.backend.model.Allowance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AllowanceRepository extends JpaRepository<Allowance, String>{

    public List<Allowance> findAll();

    Allowance findById(Integer empId);

    Allowance save(Allowance data);
}

