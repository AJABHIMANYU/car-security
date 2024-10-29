package com.newust.Car_authentication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_credentials")
public class UserCredentialsEntity {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
