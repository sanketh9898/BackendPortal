package com.employee.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="role")
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @Column(name="roleId")
    private String role;

    @Column(name="roleName")
    private String roleName;

    @OneToOne(mappedBy = "role",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private UserRole userRole;
}
