package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// This class will act as superclass to all entities extending it
@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

//    Column name of the DB we are mapping
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;


//    created_by column of db in java model maps to createdBy
    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;

}