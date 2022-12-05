package com.employee.backend.service;

import com.employee.backend.helper.Response;
import com.employee.backend.helper.ResponseHelper;
import com.employee.backend.model.*;
import com.employee.backend.repository.AddUserRepository;
import com.employee.backend.repository.AssetDetailsRepository;
import com.employee.backend.repository.AssignmentRepository;
import com.employee.backend.repository.SkillsRepository;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value="AddUserService")
public class AddUserServiceImpl implements AddUserService{

    private static final Logger logger= LoggerFactory.getLogger(AllowanceServiceImpl.class);


    @Autowired
    private AddUserRepository addUserRepository;

    @Autowired
    private AssetDetailsRepository assetDetailsRepository;

    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Override
    public Response findAll() throws Exception{
        logger.info("AddUserServiceImpl ------Starts-----");
        List<User> list = new ArrayList<User>();
        Iterable<User> UserList = addUserRepository.findAll();
        UserList.iterator().forEachRemaining(list::add);
        return ResponseHelper.getSuccessResponse("Success",list,200,"Success");

    }

    @Override
    public Response findByEmpId(Integer empId) throws Exception {
        logger.info(" AddUserServiceImpl------Starts-----"+ empId);
        User userDetails = addUserRepository.findByEmpId(empId);
        return ResponseHelper.getSuccessResponse("Success",userDetails,200,"Success");
    }


    @Override
    public Response save(User user) throws Exception{
        logger.info("AddUserServiceImpl ------Starts-----"+user);

        User userData = new User();
        Skills skill = new Skills();
        AssetDetails assetDetails = new AssetDetails();
        Assignments assign = new Assignments();

            if (user.getEmpId() == null) {
                throw new Exception();
            }
            if(user.getEmpId() != null){

                userData.setEmpId(user.getEmpId());
                userData.setEmail(user.getEmail());
                userData.setHomeManager(user.getHomeManager());
                userData.setLocation(user.getLocation());
                userData.setUserId(user.getUserId());
                userData.setAddress(user.getAddress());
                userData.setWorkExp(user.getWorkExp());

                skill.setEmpId(user.getEmpId());
                skill.setApplication(user.getApplication());
                skill.setPortfolio(user.getPortfolio());
                skill.setCertification(user.getCertification());
                skill.setExperience(user.getExperience());
                skill.setStatus(user.getStatus());
                skill.setPrimarySkill(user.getPrimarySkill());
                skill.setSeniorDirector(user.getSeniorDirector());

                assetDetails.setAssetId(user.getAssetId());
                assetDetails.setSeatId(user.getSeatId());
                assetDetails.setHeadPhone(user.getHeadphone());

                assign.setProjectId(user.getProjectId());
                assign.setProjectName(user.getProjectName());
                assign.setTeam(user.getTeam());


                addUserRepository.save(userData);
                skillsRepository.save(skill);
                assetDetailsRepository.save(assetDetails);
                assignmentRepository.save(assign);

            }

        return ResponseHelper.getSuccessResponse("saved successfully",userData,200,"Success");
    }

    @Override
    public Response update(User user) throws Exception{

        logger.info("AddUserServiceImpl ------Starts-----"+user);

        User userData = addUserRepository.findByEmpId(user.getEmpId());
        Skills skill = skillsRepository.findByEmpId(user.getEmpId());
        AssetDetails assetDetails = assetDetailsRepository.findByEmpId(user.getEmpId());
        Assignments assign = assignmentRepository.findByEmpId(user.getEmpId());


        if(user.getEmpId() == null){
            throw new Exception();
        }
        else{
            userData.setEmpId(user.getEmpId());
            userData.setEmail(user.getEmail());
            userData.setHomeManager(user.getHomeManager());
            userData.setLocation(user.getLocation());
            userData.setUserId(user.getUserId());
            userData.setAddress(user.getAddress());
            userData.setWorkExp(user.getWorkExp());

            skill.setEmpId(user.getEmpId());
            skill.setApplication(user.getApplication());
            skill.setPortfolio(user.getPortfolio());
            skill.setCertification(user.getCertification());
            skill.setExperience(user.getExperience());
            skill.setStatus(user.getStatus());
            skill.setPrimarySkill(user.getPrimarySkill());
            skill.setSeniorDirector(user.getSeniorDirector());

            assetDetails.setAssetId(user.getAssetId());
            assetDetails.setSeatId(user.getSeatId());
            assetDetails.setHeadPhone(user.getHeadphone());

            assign.setProjectId(user.getProjectId());
            assign.setProjectName(user.getProjectName());
            assign.setTeam(user.getTeam());

            addUserRepository.save(userData);
            skillsRepository.save(skill);
            assetDetailsRepository.save(assetDetails);
            assignmentRepository.save(assign);

        }

        return ResponseHelper.getSuccessResponse("update","",200,"Success");

    }
}
