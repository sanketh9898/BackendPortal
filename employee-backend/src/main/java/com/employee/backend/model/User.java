package com.employee.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="User")
public class User implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    private String empId;

    @ManyToMany (cascade = { CascadeType.ALL })
    @JoinTable(
            name= "",
            joinColumns = { @JoinColumn(name="userId") }
    )
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

    @Column(name="addressId")
    private String addressId;





    @Column(name="Address")
    private String Address;



}
