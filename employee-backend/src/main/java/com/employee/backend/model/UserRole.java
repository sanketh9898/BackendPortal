package com.employee.backend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="UserRole")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class UserRole implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    private String empId;

    @OneToOne(mappedBy = "UserRole")
    private Role roleId;

    @OneToMany(mappedBy = "UserId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<User> user;






}
