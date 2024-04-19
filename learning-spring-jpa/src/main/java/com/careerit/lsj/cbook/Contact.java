package com.careerit.lsj.cbook;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "contact_details")
@Getter
@Setter
public class Contact {

    @Id
    private UUID cid;
    @Column(name = "c_name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;

    public Contact() {
    }

    public Contact(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    @PrePersist
    public void init(){
        this.cid = UUID.randomUUID();
    }
}
