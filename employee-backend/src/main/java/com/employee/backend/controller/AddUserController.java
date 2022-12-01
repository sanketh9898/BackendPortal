package com.employee.backend.controller;

import com.employee.backend.helper.Response;
import com.employee.backend.model.Allowance;
import com.employee.backend.model.User;
import com.employee.backend.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/adduser")
@CrossOrigin(origins = "http://localhost:4200")
public class AddUserController {

    @Autowired
    private AddUserService addUserService;

    @RequestMapping(value="",method = RequestMethod.GET )
    public Response findAll() throws Exception{
        return addUserService.findAll();
    }

    @RequestMapping(value="/{empId}",method = RequestMethod.GET)
    public Response findById(@PathVariable("empId") Integer empId) throws Exception{
        return addUserService.findByEmpId(empId);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Response save(@RequestBody User UserData) throws Exception{
        return addUserService.save(UserData);

    }

    @RequestMapping(value = "/status/update",method = RequestMethod.PUT)
    public Response update(@RequestBody User UserData) throws Exception{
        return addUserService.update(UserData);
    }
}
