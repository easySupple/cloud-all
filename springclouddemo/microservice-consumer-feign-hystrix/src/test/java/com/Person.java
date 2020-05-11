package com;

import lombok.Data;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/7 9:40
 * version $Id: Person.java$
 */
@Data

public class Person {

    private String name;
    private String subject;
    private Integer score;

    public Person() {
    }

    public Person(String name, String subject, Integer score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }
}
