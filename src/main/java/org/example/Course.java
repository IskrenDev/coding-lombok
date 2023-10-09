package org.example;

import lombok.*;

import java.util.List;

//@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Value

public class Course {
    /*private String id;

    private String name;

    private Teacher teacher;

    private List<Student> studentList;*/

    String id;

    String name;

    Teacher teacher;

    List<Student> studentList;
}
