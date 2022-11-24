package com.employee.backend.service;

import com.employee.backend.helper.Response;
import com.employee.backend.model.AssetDetails;

public interface AssetDetailsService {

    Response findAll() throws Exception;

    Response findById(Integer empId) throws Exception;

    Response save(AssetDetails asset)throws Exception;



}
