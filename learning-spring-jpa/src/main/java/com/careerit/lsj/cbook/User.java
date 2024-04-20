package com.careerit.lsj.cbook;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "user_details")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    private UUID uid;
    private String name;
    private String email;
    private String password;
    @PrePersist
    public void onPrePersist(){
        this.uid = UUID.randomUUID();
        super.onPrePersist();
    }
}
