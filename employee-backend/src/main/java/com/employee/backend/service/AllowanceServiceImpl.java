package com.employee.backend.service;


import com.employee.backend.helper.Response;
import com.employee.backend.helper.ResponseHelper;
import com.employee.backend.model.Allowance;
import com.employee.backend.repository.AllowanceRepository;
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
    private AllowanceRepository allowanceRepository;

    @Override
    public Response findAll() throws Exception{
        logger.info("AllowanceServiceImpl ------Starts-----");
        List<Allowance> list = new ArrayList<Allowance>();
        Iterable<Allowance> allowanceList = allowanceRepository.findAll();
        allowanceList.iterator().forEachRemaining(list::add);
        return ResponseHelper.getSuccessResponse("Success",list,200,"Success");

    }

    @Override
    public Response findByUserId(Integer empId) throws Exception {
        logger.info("AllowanceServiceImpl ------Starts-----"+ empId);
        Allowance allowance = allowanceRepository.findByEmpId(empId);
        return ResponseHelper.getSuccessResponse("Success",allowance,200,"Success");
    }

    @Override
    public Response save(Allowance allowanceList) throws Exception {

        Allowance allowanceData = new Allowance();

        // Allowance employee = allowanceRepository.findById().orElseThrow(() -> new ResourceNotFoundException("Employee not Exist with Id:" ));
            logger.info("AllowanceServiceImpl ------Starts-----");

            if (allowanceList == null) {
                throw new Exception();
            }
            else{
                allowanceData.setEmpId(allowanceList.getEmpId());
                allowanceData.setJan(allowanceList.getJan());
                allowanceData.setFeb(allowanceList.getFeb());
                allowanceData.setMar(allowanceList.getMar());
                allowanceData.setApr(allowanceList.getApr());
                allowanceData.setMay(allowanceList.getMay());
                allowanceData.setJun(allowanceList.getJun());
                allowanceData.setJuly(allowanceList.getJuly());
                allowanceData.setAug(allowanceList.getAug());
                allowanceData.setSept(allowanceList.getSept());
                allowanceData.setOct(allowanceList.getOct());
                allowanceData.setNov(allowanceList.getNov());
                allowanceData.setDecember(allowanceList.getDecember());
                allowanceRepository.save(allowanceData);

        return ResponseHelper.getSuccessResponse("saved", allowanceData, 200, "Success");
    }

    }

}
