package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="UserRole")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Assignments implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName="userId")
    private User user;

    @Column(name="EmpName")
    private String name;

   @Column(name="ProjectManager")
    private String Manager;

   @Column(name="ProjectId")
    private String projectId;

   @Column(name="Team")
    private String team;

   @Column(name="ProjectName")
   private String ProjectName;

   @Column(name="Application")
    private String application;

   @Column(name="Experience")
    private String experience;


}
