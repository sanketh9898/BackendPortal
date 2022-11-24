package com.employee.backend.service;


import com.employee.backend.helper.Response;
import com.employee.backend.helper.ResponseHelper;
import com.employee.backend.model.Allowance;
import com.employee.backend.model.Assignments;
import com.employee.backend.repository.AssignmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "AssignmentService")
public class AssignmentServiceImpl implements AssignmentService{

    private static final Logger logger= LoggerFactory.getLogger(AllowanceServiceImpl.class);

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Override
    public Response findAll() throws Exception{
        logger.info("AssignmentServiceImpl ------Starts-----");
        List<Assignments> list = new ArrayList<Assignments>();
        Iterable<Assignments> assignments = assignmentRepository.findAll();
        assignments.iterator().forEachRemaining(list::add);
        return ResponseHelper.getSuccessResponse("Success",list,200,"Success");

    }

    @Override
    public Response findById(Integer empId) throws Exception {
        logger.info("AllowanceServiceImpl ------Starts-----"+ empId);
        Assignments assignments = assignmentRepository.findById(empId);
        return ResponseHelper.getSuccessResponse("Success",assignments,200,"Success");
    }

    @Override
    public Response save(Assignments assign) throws Exception
    {

        logger.info("AllowanceServiceImpl ------Starts-----"+assign);

        Assignments assignments = new Assignments();

        assignments.setEmpId(assign.getEmpId());
        assignments.setName(assign.getName());
        assignments.setTeam(assign.getTeam());
        assignments.setProjectName(assign.getProjectName());
        assignments.setProjectId(assign.getProjectId());
        assignments.setApplication(assign.getApplication());
        assignments.setExperience(assign.getExperience());

        assignmentRepository.save(assignments);

        return ResponseHelper.getSuccessResponse("Success",assign,200,"Success");
    }
}
