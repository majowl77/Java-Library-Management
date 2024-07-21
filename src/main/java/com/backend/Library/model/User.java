package com.backend.Library.model;

import com.backend.Library.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "the first name can't be empty")
    private String firstName;
    @NotEmpty(message = "the last name can't be empty")
    private String lastName ;
    private String email;
    private String password;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "role")
    private Role role;

}
