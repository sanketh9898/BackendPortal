package com.employee.backend.service;


import com.employee.backend.helper.Response;

public interface AllowanceService {

    Response findAll() throws Exception;

    Response findById(Integer empId) throws Exception;

}
