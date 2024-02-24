package com.example.projet2024.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Response")
public class Response {
    @Id
    @Column(name = "idResponse")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idResponse ;
    @Basic
    @Column(name = "Response")
    private String Response ;
    @OneToOne(mappedBy="response")
    private Claim claim;
}
