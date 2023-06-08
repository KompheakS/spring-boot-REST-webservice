package net.java.springbootrestfulwebservice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String userFirstName;

    @Column(name = "last_name", nullable = false)
    private String userLastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

}
