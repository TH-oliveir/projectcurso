package com.tholiveiweb.coursetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tholiveiweb.coursetest.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
