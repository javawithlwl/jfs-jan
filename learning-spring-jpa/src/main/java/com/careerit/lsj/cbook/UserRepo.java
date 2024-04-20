package com.careerit.lsj.cbook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID>{

    @Query("select u from User u where u.deleted = false")
    public List<User> findAll();
}
