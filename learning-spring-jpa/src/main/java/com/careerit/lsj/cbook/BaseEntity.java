package com.careerit.lsj.cbook;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    private boolean deleted;

    @Column(name = "created_date",updatable = false,nullable = false)
    private LocalDateTime createdDate;


    @Column(name = "modified_date",nullable = false)
    private LocalDateTime modifiedDate;

    @PrePersist
    public void onPrePersist(){
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
    }
    @PreUpdate
    public void onPreUpdate(){
        this.modifiedDate = LocalDateTime.now();
    }
}
