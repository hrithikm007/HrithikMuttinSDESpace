package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

//    Column name of the DB we are mapping
    @Column(name = "created_at", updatable = false)
    private LocalDate created_at;

    @Column(updatable = false)
    private String created_by;

    @Column(insertable = false)
    private LocalDate updated_at;

    @Column(insertable = false)
    private String updated_by;

}