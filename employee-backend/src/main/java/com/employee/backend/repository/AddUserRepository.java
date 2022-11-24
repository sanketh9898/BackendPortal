package com.employee.backend.repository;


import com.employee.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddUserRepository extends CrudRepository<User, String> {

    public List<User> findAll();

    public User findById(Integer empId);

    public User save(User user);

    public User update(User user);
}
