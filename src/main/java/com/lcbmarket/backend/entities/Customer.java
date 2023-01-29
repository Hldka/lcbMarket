package com.lcbmarket.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "customer_id",nullable = false,unique = true)
    private Long id;
    @Column(nullable = false,unique = true)
    private  String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(name = "mobil_number")
  private String telNo;
@Column()

private String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Address> addresses;


}
