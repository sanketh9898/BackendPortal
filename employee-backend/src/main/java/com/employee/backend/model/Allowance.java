package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="Internet_Allowance")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Allowance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @OneToMany
    @JoinColumn(name = "userid")
    private Set<User> userid;

    @Column(name="Jan")
    private String jan;

    @Column(name="feb")
    private String feb;

    @Column(name="March")
    private String mar;

    @Column(name="April")
    private String apr;

    @Column(name="May")
    private String may;

    @Column(name="June")
    private String jun;

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
}
