package com.careerit.lsj.cbook;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContactRepo extends BaseEntityCrudRepository<Contact, UUID> {

        @Query("select c from Contact c where c.email like %:email% and c.deleted = false")
        public List<Contact> findByEmail(@Param("email") String email);

}
