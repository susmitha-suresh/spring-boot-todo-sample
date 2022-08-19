package com.sample.project.demo.repository;

import com.sample.project.demo.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDetailsRepository extends JpaRepository <UserDetails, Integer> {
}
