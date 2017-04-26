package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.user.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
