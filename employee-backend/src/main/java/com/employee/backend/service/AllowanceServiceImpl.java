package com.employee.backend.service;


import com.employee.backend.helper.Response;
import com.employee.backend.helper.ResponseHelper;
import com.employee.backend.model.Allowance;
import com.employee.backend.repository.Allowancerepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value="allowanceService")
public class AllowanceServiceImpl implements AllowanceService{

    private static final Logger logger= LoggerFactory.getLogger(AllowanceServiceImpl.class);

    @Autowired
    private Allowancerepository allowanceRepository;

    @Override
    public Response findAll() throws Exception{
        logger.info("AllowanceServiceImpl ------Starts-----");
        List<Allowance> list = new ArrayList<Allowance>();
        Iterable<Allowance> allowanceList = allowanceRepository.findAll();
        allowanceList.iterator().forEachRemaining(list::add);
        return ResponseHelper.getSuccessResponse("Success",list,200,"Success");

    }

    @Override
    public Response findById(Integer empId) throws Exception {
        logger.info("AllowanceServiceImpl ------Starts-----"+ empId);
        Allowance allowance = allowanceRepository.findById(empId);
        return ResponseHelper.getSuccessResponse("Success",allowance,200,"Success");
    }


}
