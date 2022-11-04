package com.employee.backend.controller;


import com.employee.backend.helper.Response;
import com.employee.backend.service.AllowanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/internetAllowance")
@CrossOrigin(origins = "http://localhost:4200")
public class AllowanceController {

    @Autowired
    private AllowanceService allowanceService;

    @RequestMapping(value="",method = RequestMethod.GET )
    public Response findAll() throws Exception{
        return allowanceService.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Response findById(@PathVariable("empId") Integer id) throws Exception{
        return allowanceService.findById(id);
    }


}
