package com.sample.project.demo.repository;

import com.sample.project.demo.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TasksRepository extends JpaRepository <Tasks, Integer> {
}
