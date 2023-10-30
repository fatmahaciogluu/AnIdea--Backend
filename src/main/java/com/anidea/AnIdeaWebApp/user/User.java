package com.anidea.AnIdeaWebApp.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
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

}
