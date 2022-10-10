package com.employee.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    
    @Id

	private String EmpId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	
	
	@Column(name="HomeManager")
	private String HomeManager;
	
	@Column(name="Location")
	private String Location;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="WorkExp")
	private String WorkExp;
	
	@Column(name="SeatId")
	private String SeatId;
	
	@Column(name="AssetId")
	private String AssetId;
	
	@Column(name="HeadPhone")
	private String HeadPhone;
	
	@Column(name="Internet")
	private String Internet;
	
	@Column(name="ProjectId")
	private String ProjectId;
	
	@Column(name="ProjectName")
	private String ProjectName;
	
	@Column(name="AgileTeam")
	private String AgileTeam;
	
	@Column(name="Skills")
	private String Skills;
	
	@Column(name="Portfolio")
	private String Portfolio;
	
	@Column(name="SeniorDir")
	private String SeniorDir;
	
	@Column(name="LibertyExp")
	private String LibertyExp;
	
	@Column(name="CognizantExp")
	private String CognizantExp;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="LastWorkigDay")
	private String LastWorkigDay;
	
	@Column(name="LibertyApplication")
	private String LibertyApplication;
	
	@Column(name="Certification")
	private String Certification;

    public Product(String name, String email, String phone, String empId, String homeManager, String location, String address, String workExp, String seatId, String assetId, String headPhone, String internet, String projectId, String projectName, String agileTeam, String skills, String portfolio,String seniorDir, String libertyExp, String cognizantExp, String status, String lastWorkingDay, String libertyApplication, String certification ) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.EmpId = empId;
		this.HomeManager = homeManager;
		this.Location = location;
		this.Address = address;
		this.WorkExp = workExp;
		this.SeatId = seatId;
		this.AssetId = assetId;
		this.HeadPhone = headPhone;
		this.Internet = internet;
		this.ProjectId = projectId;
		this.ProjectName = projectName;
		this.AgileTeam = agileTeam;
		this.Skills = skills;
		this.Portfolio = portfolio;
		this.SeniorDir = seniorDir;
		this.LibertyExp = libertyExp;
		this.CognizantExp = cognizantExp;
		this.Status = status;
		this.LastWorkigDay = lastWorkingDay;
		this.LibertyApplication = libertyApplication;
		this.Certification = certification;
	}


    public Product() {
    }

    public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getWorkExp() {
		return WorkExp;
	}


	public void setWorkExp(String workExp) {
		WorkExp = workExp;
	}


	public String getSeatId() {
		return SeatId;
	}


	public void setSeatId(String seatId) {
		SeatId = seatId;
	}


	public String getAssetId() {
		return AssetId;
	}


	public void setAssetId(String assetId) {
		AssetId = assetId;
	}


	public String getHeadPhone() {
		return HeadPhone;
	}


	public void setHeadPhone(String headPhone) {
		HeadPhone = headPhone;
	}


	public String getInternet() {
		return Internet;
	}


	public void setInternet(String internet) {
		Internet = internet;
	}


	public String getProjectId() {
		return ProjectId;
	}


	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}


	public String getProjectName() {
		return ProjectName;
	}


	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}


	public String getAgileTeam() {
		return AgileTeam;
	}


	public void setAgileTeam(String agileTeam) {
		AgileTeam = agileTeam;
	}


	public String getSkills() {
		return Skills;
	}


	public void setSkills(String skills) {
		Skills = skills;
	}


	public String getPortfolio() {
		return Portfolio;
	}


	public void setPortfolio(String portfolio) {
		Portfolio = portfolio;
	}


	public String getSeniorDir() {
		return SeniorDir;
	}


	public void setSeniorDir(String seniorDir) {
		SeniorDir = seniorDir;
	}


	public String getLibertyExp() {
		return LibertyExp;
	}


	public void setLibertyExp(String libertyExp) {
		LibertyExp = libertyExp;
	}


	public String getCognizantExp() {
		return CognizantExp;
	}


	public void setCognizantExp(String cognizantExp) {
		CognizantExp = cognizantExp;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getLastWorkigDay() {
		return LastWorkigDay;
	}


	public void setLastWorkigDay(String lastWorkigDay) {
		LastWorkigDay = lastWorkigDay;
	}


	public String getLibertyApplication() {
		return LibertyApplication;
	}


	public void setLibertyApplication(String libertyApplication) {
		LibertyApplication = libertyApplication;
	}


	public String getCertification() {
		return Certification;
	}


	public void setCertification(String certification) {
		Certification = certification;
	}


	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getHomeManager() {
		return HomeManager;
	}
	public void setHomeManager(String homeManager) {
		HomeManager = homeManager;
	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
