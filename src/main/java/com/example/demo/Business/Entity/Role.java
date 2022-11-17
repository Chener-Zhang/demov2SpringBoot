package com.example.demo.Business.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_roles")
@Getter
@Setter
public class Role implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "role_name")
    private String name;
    @ManyToMany(mappedBy = "User", fetch = FetchType.LAZY)
    private Set<User> roles = new HashSet<>();
}
