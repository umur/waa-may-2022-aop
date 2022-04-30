package com.example.springdata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class ActivityLog {
    @Id
    @GeneratedValue
    private int id;

    private LocalDateTime date;

    private String operation;

    private Long duration;
}
