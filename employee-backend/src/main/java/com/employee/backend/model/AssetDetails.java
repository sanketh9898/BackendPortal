package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="assetDetails")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class AssetDetails implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;


    @Column(name = "assetId")
    private String assetId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empId")
    private Integer empId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName="userId")
    private User user;

    @Column(name = "empName")
    private String empName;

    @Column(name = "seatId")
    private String seatId;

    @Column(name = "headPhone")
    private String HeadPhone;

    @Column(name = "Dongle")
    private String dongle;
}



