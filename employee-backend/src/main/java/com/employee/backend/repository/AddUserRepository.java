package com.employee.backend.repository;


import com.employee.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddUserRepository extends JpaRepository<User, Integer>{

    public List<User> findAll();

    public User findByEmpId(Integer empId);

    public User save(User user);

}
