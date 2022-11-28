package atu.ie.Users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private String name ;
    private String email ;
    private String password ;
    private UUID id ;



    public User(@JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("password") String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }
}
