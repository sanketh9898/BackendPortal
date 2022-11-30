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
    public Response findByUserId(Integer empId) throws Exception {
        logger.info(" AddUserServiceImpl------Starts-----"+ empId);
        User userDetails = addUserRepository.findByUserId(empId);
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
                skill.setApplication(user.getSkill().getApplication());
                skill.setPortfolio(user.getSkill().getPortfolio());
                skill.setCertification(user.getSkill().getCertification());
                skill.setExperience(user.getSkill().getExperience());
                skill.setStatus(user.getSkill().getStatus());
                skill.setPrimarySkill(user.getSkill().getPrimarySkill());
                skill.setSeniorDirector(user.getSkill().getSeniorDirector());

                assetDetails.setAssetId(user.getDetails().getAssetId());
                assetDetails.setSeatId(user.getDetails().getSeatId());
                assetDetails.setHeadPhone(user.getDetails().getHeadPhone());

                assign.setProjectId(user.getAssign().getProjectId());
                assign.setProjectName(user.getAssign().getProjectName());
                assign.setTeam(user.getAssign().getTeam());


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

        User userData = addUserRepository.findByUserId(user.getEmpId());
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
            skill.setApplication(user.getSkill().getApplication());
            skill.setPortfolio(user.getSkill().getPortfolio());
            skill.setCertification(user.getSkill().getCertification());
            skill.setExperience(user.getSkill().getExperience());
            skill.setStatus(user.getSkill().getStatus());
            skill.setPrimarySkill(user.getSkill().getPrimarySkill());
            skill.setSeniorDirector(user.getSkill().getSeniorDirector());

            assetDetails.setAssetId(user.getDetails().getAssetId());
            assetDetails.setSeatId(user.getDetails().getSeatId());
            assetDetails.setHeadPhone(user.getDetails().getHeadPhone());

            assign.setProjectId(user.getAssign().getProjectId());
            assign.setProjectName(user.getAssign().getProjectName());
            assign.setTeam(user.getAssign().getTeam());

            addUserRepository.save(userData);
            skillsRepository.save(skill);
            assetDetailsRepository.save(assetDetails);
            assignmentRepository.save(assign);

        }

        return ResponseHelper.getSuccessResponse("update","",200,"Success");

    }
}
