package com.sample.project.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

public class UserDetails {
    @Id
    @GeneratedValue
    private int userDetailsId;
    private String userName;
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
    private Boolean isActive;
}
