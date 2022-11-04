package com.employee.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="AssetDetails")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class AssetDetails implements Serializable {

    private static final long serialVersionUID = 4050660680047579957L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assetId")
    private Integer assetId;

    @OneToMany(mappedBy = "UserId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<User> user;

    @Column(name = "empName")
    private String empName;

    @Column(name = "headPhone")
    private String HeadPhone;

    @Column(name = "Dongle")
    private String dongle;
}



