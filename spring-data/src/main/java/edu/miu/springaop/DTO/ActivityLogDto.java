package edu.miu.springaop.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ActivityLogDto {

    private int id;
    private LocalDate date;
    private String operation;
    private double duration;

    public ActivityLogDto() {

    }

    public ActivityLogDto(LocalDate d, String operation, double duration) {
        this.date = d;
        this.operation = operation;
        this.duration = duration;
    }


}
