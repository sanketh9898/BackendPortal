package com.employee.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="skills")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Skills implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName="userId")
    private User user;

    @Column(name = "primarySkill")
    private String primarySkill;

    @Column(name="portfolio")
    private String portfolio;

    @Column(name="status")
    private String status;

    @Column(name="Experience")
    private String experience;

    @Column(name="SeniorDirector")
    private String seniorDirector;

    @Column(name="Application")
    private String application;

    @Column(name="certification")
    private String certification;

}
