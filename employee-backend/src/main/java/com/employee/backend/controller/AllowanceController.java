package com.employee.backend.controller;


import com.employee.backend.helper.Response;
import com.employee.backend.model.Allowance;
import com.employee.backend.service.AllowanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @RequestMapping(value="/{empId}",method = RequestMethod.GET)
    public Response findByUserId(@PathVariable("empId") Integer id) throws Exception{
        return allowanceService.findByUserId(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Response save(@RequestBody Allowance allowanceList) throws Exception{
        return allowanceService.save(allowanceList);

    }


}
