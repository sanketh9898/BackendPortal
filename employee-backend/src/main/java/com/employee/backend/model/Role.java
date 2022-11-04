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
    private String empId;

    @OneToOne
    @JoinColumn(name="roleId")
    private UserRole role;

    @Column(name="roleName")
    private String roleName;


}
