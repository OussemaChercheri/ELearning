package com.example.projet2024.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Test")
public class Test {
    @Id
    @Column(name = "TestID")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private   Long TestID ;
    @Basic
    @Column(name = "prenomEt")
    private String prenomEt;

    @Basic
    @Column(name = "Title")
    private String Title ;

    @Basic
    @Column(name = "Description")
    private String  Description ;

    @Basic
    @Column(name = "Duration")
    private int Duration ;

   /* @Basic
    @Column(name = "Questions")
    private Set <Questions>  ;
*/
    @Temporal (TemporalType.DATE)
    @Column(name = "Start_time")
    private Date Start_time ;
    @Temporal (TemporalType.DATE)
    @Column(name = "End_time")
    private Date End_time ;
    @ManyToOne
    Post post;

}
