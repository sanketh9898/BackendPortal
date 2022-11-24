package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="User")
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @Column(name="userId")
    private String UserId;

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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Allowance allowance;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private AssetDetails assetDetails ;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Assignments assignment;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Skills skills;

}