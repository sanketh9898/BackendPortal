package com.employee.backend.service;


import com.employee.backend.helper.Response;
import com.employee.backend.helper.ResponseHelper;
import com.employee.backend.model.AssetDetails;
import com.employee.backend.model.Assignments;
import com.employee.backend.repository.AssetDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetDetailsServiceImpl implements AssetDetailsService {

    private static final Logger logger= LoggerFactory.getLogger(AllowanceServiceImpl.class);

    @Autowired
    private AssetDetailsRepository assetDetailsRepository;


    @Override
    public Response findAll() throws Exception {
        logger.info("AssignmentServiceImpl ------Starts-----");
        List<AssetDetails> list = new ArrayList<AssetDetails>();
        Iterable<AssetDetails> details = assetDetailsRepository.findAll();
        details.iterator().forEachRemaining(list::add);
        return ResponseHelper.getSuccessResponse("Success",list,200,"Success");

    }

    @Override
    public Response findByUserId(Integer empId) throws Exception {
        logger.info("AllowanceServiceImpl ------Starts-----"+ empId);
        AssetDetails details = assetDetailsRepository.findByEmpId(empId);
        return ResponseHelper.getSuccessResponse("Success",details,200,"Success");
    }

    @Override
    public Response save(AssetDetails asset) throws Exception{
        logger.info("AllowanceServiceImpl ------Starts-----"+ asset);

        AssetDetails details = new AssetDetails();

        if(asset == null){
            throw  new Exception();
        }
        else{
            details.setAssetId(asset.getAssetId());
            details.setHeadPhone(asset.getHeadPhone());
            details.setSeatId(asset.getSeatId());
            details.setDongle(asset.getDongle());
            assetDetailsRepository.save(details);
        }

        return ResponseHelper.getSuccessResponse("Success",asset,200,"Success");

    }

}
