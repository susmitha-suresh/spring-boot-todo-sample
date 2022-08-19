package com.sample.project.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Data
@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
    private Boolean isActive;
}
