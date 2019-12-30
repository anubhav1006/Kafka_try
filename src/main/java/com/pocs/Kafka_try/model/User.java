package com.pocs.Kafka_try.model;

import lombok.Data;

@Data
public class User {
    public String name;
    public String email;
    public String gender;

    public User(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public User(){}
}
