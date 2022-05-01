package com.has.aop.entity.joinedtable;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class ReviewJoined extends UserJoined{

    private String comment;
    private int numberOfStars;
}
