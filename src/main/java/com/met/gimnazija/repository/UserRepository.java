package com.met.gimnazija.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.met.gimnazija.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
