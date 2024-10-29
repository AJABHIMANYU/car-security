package com.newust.Car_authentication.repository;

import com.newust.Car_authentication.entity.UserCredentialsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserCredentialsRepository extends MongoRepository<UserCredentialsEntity,Integer> {
    public Optional<UserCredentialsEntity> findByName(String name);
}
