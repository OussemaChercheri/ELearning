package com.example.projet2024.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Post")
public class Post {
    @Id
    @Column(name = "PostingID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostingID;
    @Basic
    @Column(name = "Title")
    private String Title;
    @Basic
    @Column(name = "Description")
    private String Description;
    @Basic
    @Column(name = "Requirements")
    private String Requirements;
    @Basic
    @Column(name = "Duration")
    private int Duration;
    @Temporal(TemporalType.DATE)
    @Column(name = "StartDate")
    private Date StartDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "EndDate")
    private Date EndDate;
    @OneToOne(mappedBy="post")
    private Appointment appointment;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="post")
    private Set<Test> Tests;
    @ManyToOne
    Company company;

}