package com.employee.backend.repository;

import com.employee.backend.model.Employee;
import com.employee.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Employee, String> {
}
