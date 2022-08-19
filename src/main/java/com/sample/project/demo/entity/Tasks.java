package com.sample.project.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tasks {
    @Id
    @GeneratedValue
    private int id;
    private String taskName;
    private String status;
    private Boolean hasCompleted;
    @ManyToOne(targetEntity = UserDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="users_task_fk",referencedColumnName = "id")
    private List<UserDetails> userDetailsId;
}
