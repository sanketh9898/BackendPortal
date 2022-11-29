package com.employee.backend.service;


import com.employee.backend.helper.Response;
import com.employee.backend.model.Allowance;

import java.util.List;

public interface AllowanceService {

    Response findAll() throws Exception;

    Response findByUserId(Integer empId) throws Exception;

    Response save(Allowance allowanceList) throws Exception;

}
