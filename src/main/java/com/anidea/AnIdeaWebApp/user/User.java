package com.anidea.AnIdeaWebApp.user;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class User {

    @Id
    @GeneratedValue
    Long id;

    @Getter
    @Setter
    String username;

    @Getter
    @Setter
    String email;

    @Getter
    @Setter
    String password;

    @Getter
    @Setter
    boolean active= false;

    @Getter
    @Setter
    String activationToken;
}
