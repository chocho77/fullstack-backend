package com.codewithchocho.fullstackbackend.repository;

import com.codewithchocho.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
