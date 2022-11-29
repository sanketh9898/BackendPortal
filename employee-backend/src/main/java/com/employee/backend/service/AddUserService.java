package com.employee.backend.service;

import com.employee.backend.helper.Response;
import com.employee.backend.model.User;

import java.util.List;

public interface AddUserService {

    Response findAll() throws Exception;

    Response findByUserId(Integer empId) throws Exception;

    Response save(User user) throws Exception;

    Response update(User user)throws Exception;


}
