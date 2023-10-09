package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Student {

    private String id;

    private String name;

    private String address;

    @With
    double grade;

}
