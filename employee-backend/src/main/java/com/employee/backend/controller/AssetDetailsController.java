package com.employee.backend.controller;

import com.employee.backend.helper.Response;
import com.employee.backend.model.Allowance;
import com.employee.backend.model.AssetDetails;
import com.employee.backend.service.AssetDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/AssetDetails")
@CrossOrigin(origins = "http://localhost:4200")
public class AssetDetailsController {

    @Autowired
    private AssetDetailsService assetDetailsService;

    @RequestMapping(value="",method = RequestMethod.GET )
    public Response findAll() throws Exception{
        return assetDetailsService.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Response findById(@PathVariable("empId") Integer id) throws Exception{
        return assetDetailsService.findById(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Response save(@RequestBody AssetDetails asset) throws Exception{
        return assetDetailsService.save(asset);

    }

}
