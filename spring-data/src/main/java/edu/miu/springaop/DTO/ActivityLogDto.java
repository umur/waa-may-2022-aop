package edu.miu.springaop.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class ActivityLogDto {

    private int id;
    private LocalDate date;
    private String operation;
    private double duration;

}
