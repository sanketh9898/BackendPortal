package com.employee.backend.model;


import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="employees")
public class Employee {
	
	@Id

	private String EmpId;
	
	@Column(name="jan")
	private String jan;
	
	@Column(name="feb")
	private String feb;
	
	@Column(name="march")
	private String march;
	
	@Column(name="april")
	private String april;
	
	@Column(name="may")
	private String may;
	
	@Column(name="june")
	private String june;
	
	@Column(name="july")
	private String july;
	
	@Column(name="aug")
	private String aug;
	
	@Column(name="sept")
	private String sept;
	
	@Column(name="oct")
	private String oct;
	
	@Column(name="nov")
	private String nov;
	
	@Column(name="december")
	private String december;
	
	
	
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

//	private String id;
	@Column(name="Password")
	private String Password;
	@Column(name="Username")
	private String Username;
	
	
	
	public Employee(String jan, String feb, String march, String april, String may, String june, String july, String aug,
			String sept, String oct, String username,String nov, String december,String name, String email, String phone, String password,String empId, String homeManager, String location, String address, String workExp, String seatId, String assetId, String headPhone, String internet, String projectId, String projectName, String agileTeam, String skills, String portfolio,String seniorDir, String libertyExp, String cognizantExp, String status, String lastWorkingDay, String libertyApplication, String certification 
			) {
		super();
		this.jan = jan;
		this.feb = feb;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.aug = aug;
		this.sept = sept;
		this.oct = oct;
		this.nov = nov;
		this.december = december;
		this.Password = password;
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
		this.Username = username;
		this.Certification = certification;
	}
	

	public Employee() {
		
	}
	

	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}
	
	
	
	public void setPassword(String password) {
		password = password;
	}
	

	public String getpassword() {
		return Password;
	}
	
	public void setUsername(String username) {
		Username = username;
	}
	

	public String getusername() {
		return Username;
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
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
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
	

	public String getJan() {
		return jan;
	}


	public void setJan(String jan) {
		this.jan = jan;
	}


	public String getFeb() {
		return feb;
	}


	public void setFeb(String feb) {
		this.feb = feb;
	}


	public String getMarch() {
		return march;
	}


	public void setMarch(String march) {
		this.march = march;
	}


	public String getApril() {
		return april;
	}


	public void setApril(String april) {
		this.april = april;
	}


	public String getMay() {
		return may;
	}


	public void setMay(String may) {
		this.may = may;
	}


	public String getJune() {
		return june;
	}


	public void setJune(String june) {
		this.june = june;
	}


	public String getJuly() {
		return july;
	}


	public void setJuly(String july) {
		this.july = july;
	}


	public String getAug() {
		return aug;
	}


	public void setAug(String aug) {
		this.aug = aug;
	}


	public String getSept() {
		return sept;
	}


	public void setSept(String sept) {
		this.sept = sept;
	}


	public String getOct() {
		return oct;
	}


	public void setOct(String oct) {
		this.oct = oct;
	}


	public String getNov() {
		return nov;
	}


	public void setNov(String nov) {
		this.nov = nov;
	}


	public String getDecember() {
		return december;
	}
	public void setDecember(String december) {
		this.december = december;
	}


	//------------------------------------------
	
	
	
}
