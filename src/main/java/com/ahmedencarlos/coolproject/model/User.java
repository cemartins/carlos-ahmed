package com.ahmedencarlos.coolproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
}