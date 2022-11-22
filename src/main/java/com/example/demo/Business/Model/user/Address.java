package com.example.demo.Business.Model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String street;
    private String suite;
    private String city;
    private String zipCode;
    @OneToOne(mappedBy = "address")
    private User user;


}
