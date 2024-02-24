package com.example.projet2024.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Company")
public class Company {
    @Id
    @Column(name = "CompanyID")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long CompanyID ;
    @Basic
    @Column(name = "Name")
    private String Name ;
    @Basic
    @Column(name = "logo")
    private String logo ;
    @Basic
    @Column(name = "Location")
    private String Location ;
    @Basic
    @Column(name = "Description")
    private String Description ;
    @Basic
    @Column(name = "Industry")
    private String Industry ;




    @OneToMany(cascade = CascadeType.ALL, mappedBy="company")
    private Set<Post> Posts;
    @ManyToMany(mappedBy="companys", cascade = CascadeType.ALL)
    private Set<User> users;
}
