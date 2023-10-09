package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student1 = Student.builder()

                .id("1")
                .name("Iskren")
                .address("Musterstraße 123")
                .grade("2")
                .build();

        Student student2 = Student.builder()

                .id("2")
                .name("Peter")
                .address("Musterweg 456")
                .grade("1")
                .build();

        Teacher teacher1 = Teacher.builder()

                .id("001")
                .name("Harry")
                .subject("Mathematics")
                .build();

        Teacher teacher2 = Teacher.builder()

                .id("002")
                .name("Anna")
                .subject("Biology")
                .build();

        Course course1 = Course.builder()
                .id("201")
                .name("Maths course")
                .teacher(teacher1)
                .studentList(List.of(student1, student2))
                .build();

        Course course2 = Course.builder()
                .id("202")
                .name("Biology course")
                .teacher(teacher1)
                .studentList(List.of(student1, student2))
                .build();

        student1.setAddress("Neustraße 341");
        System.out.println(student1);

        System.out.println(student2.getName());

        System.out.println(student2.getGrade().equals("2"));


        Student student3 = student1.withGrade("3");

        System.out.println(student3);

    }
}