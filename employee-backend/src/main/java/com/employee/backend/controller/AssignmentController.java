package com.employee.backend.controller;


import com.employee.backend.helper.Response;
import com.employee.backend.model.Assignments;
import com.employee.backend.model.User;
import com.employee.backend.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Assignments")
@CrossOrigin(origins = "http://localhost:4200")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Response findAll() throws Exception {
        return assignmentService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response findById(@PathVariable("empId") Integer id) throws Exception {
        return assignmentService.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Response save(@RequestBody Assignments assign) throws Exception {
        return assignmentService.save(assign);

    }
}

