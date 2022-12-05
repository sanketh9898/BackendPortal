package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user")
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @Column(name="userId")
    private Integer userId;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="homeManager")
    private String HomeManager;

    @Column(name="location")
    private String Location;

    @Column(name="Address")
    private String Address;

    @Column(name="WrkExp")
    private String workExp;

    @Transient
    private String assetId;

    @Transient
    private String seatId;

    @Transient
    private String Headphone;

    @Transient
    private String projectId;

    @Transient
    private String projectName;

    @Transient
    private String Team;

    @Transient
    private String Application;

    @Transient
    private String portfolio;

    @Transient
    private String certification;

    @Transient
    private String Experience;

    @Transient
    private String status;

    @Transient
    private String primarySkill;

    @Transient
    private String seniorDirector;






}