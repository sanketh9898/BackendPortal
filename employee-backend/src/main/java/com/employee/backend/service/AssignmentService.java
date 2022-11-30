package com.employee.backend.service;

import com.employee.backend.helper.Response;
import com.employee.backend.model.Assignments;

public interface AssignmentService {

    Response findAll() throws Exception;

    Response findByUserId(Integer empId) throws Exception;

    Response save (Assignments assign) throws Exception;

}
