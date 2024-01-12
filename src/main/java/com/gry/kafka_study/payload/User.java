package com.gry.kafka_study.payload;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
}
