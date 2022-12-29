package com.employee.backend.controller;

import com.employee.backend.helper.Response;
import com.employee.backend.model.Allowance;
import com.employee.backend.model.AssetDetails;
import com.employee.backend.model.Assignments;
import com.employee.backend.model.User;
import com.employee.backend.service.AddUserService;
import com.employee.backend.service.AllowanceService;
import com.employee.backend.service.AssetDetailsService;
import com.employee.backend.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employeeDetails")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private AddUserService addUserService;

    @Autowired
    private AllowanceService allowanceService;

    @Autowired
    private AssetDetailsService assetDetailsService;

    @Autowired
    private AssignmentService assignmentService;


    @RequestMapping(value="employee",method = RequestMethod.GET )
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

    @RequestMapping(value = "/status/update/{empId}",method = RequestMethod.PUT)
    public Response update(@PathVariable("empId") Integer empId,@RequestBody User UserData) throws Exception{
        return addUserService.update(UserData,empId);
    }


    @RequestMapping(value="/allowance",method = RequestMethod.GET )
    public Response allowanceFindAll() throws Exception{
        return allowanceService.findAll();
    }

    @RequestMapping(value="/allowance/{empId}",method = RequestMethod.GET)
    public Response findByUserId(@PathVariable("empId") Integer id) throws Exception{
        return allowanceService.findByUserId(id);
    }

    @RequestMapping(value = "/allowance/save",method = RequestMethod.POST)
    public Response save(@RequestBody Allowance allowanceList) throws Exception{
        return allowanceService.save(allowanceList);

    }

    @RequestMapping(value="/asset",method = RequestMethod.GET )
    public Response assetFindAll() throws Exception{
        return assetDetailsService.findAll();
    }

    @RequestMapping(value="/asset/{empId}",method = RequestMethod.GET)
    public Response findByAssetId(@PathVariable("empId") Integer id) throws Exception{
        return assetDetailsService.findByUserId(id);
    }

    @RequestMapping(value = "/asset/save",method = RequestMethod.POST)
    public Response save(@RequestBody AssetDetails asset) throws Exception{
        return assetDetailsService.save(asset);

    }

    @RequestMapping(value = "/assign", method = RequestMethod.GET)
    public Response assignFindAll() throws Exception {
        return assignmentService.findAll();
    }

    @RequestMapping(value = "/assign/{empId}", method = RequestMethod.GET)
    public Response findByAssignId(@PathVariable("empId") Integer id) throws Exception {
        return assignmentService.findByUserId(id);
    }

    @RequestMapping(value = "/assign/save", method = RequestMethod.POST)
    public Response save(@RequestBody Assignments assign) throws Exception {
        return assignmentService.save(assign);

    }

}
