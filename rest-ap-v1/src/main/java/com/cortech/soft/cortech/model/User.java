package com.cortech.soft.cortech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
//@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false,unique = true)
    private String phone;
    @Column( columnDefinition="int(1) default 1  ")
    private Integer state ;


}
