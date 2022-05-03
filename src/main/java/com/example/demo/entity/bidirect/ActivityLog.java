package com.example.demo.entity.bidirect;

import jdk.jfr.Timespan;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

@Entity
@Data
public class ActivityLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime date;
    private String operation;
    private String duration;
}
