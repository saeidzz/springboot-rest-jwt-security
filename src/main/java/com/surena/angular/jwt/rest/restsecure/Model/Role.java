package com.surena.angular.jwt.rest.restsecure.Model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToOne
    private User user;

    public Role(String name) {
        this.name = name;
    }
}