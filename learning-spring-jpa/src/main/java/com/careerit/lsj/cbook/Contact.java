package com.careerit.lsj.cbook;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "contact")
@Getter
@Setter
public class Contact extends BaseEntity{

    @Id
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "city")
    private String city;


    public Contact() {
    }

    public Contact(String name, String email, String mobile, String city) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
    }

    @PrePersist
    public void onPrePersist(){
        this.id = UUID.randomUUID();
        super.onPrePersist();
    }


}
