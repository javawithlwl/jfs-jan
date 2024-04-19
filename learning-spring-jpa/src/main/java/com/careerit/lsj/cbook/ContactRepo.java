package com.careerit.lsj.cbook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ContactRepo extends JpaRepository<Contact, UUID> {

        @Query("select c from Contact c where c.email like %:email%")
        public List<Contact> findByEmail(@Param("email") String email);
}
