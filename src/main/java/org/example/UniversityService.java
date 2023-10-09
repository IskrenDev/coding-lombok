package org.example;

import java.util.List;

public class UniversityService {
    public double getAvarageGradePerCourse(Course course) {

        List<Student> courseStudents = course.getStudentList();

        double studentGrade = 0;

        for(Student student : courseStudents){
            studentGrade += student.getGrade();
        }
        return studentGrade/courseStudents.size();
    }

    /*public double getAvarageForUniversity(University university) {

        List<Course> courseStudents = university.getStudentList().stream().toList();

        double studentGrade = 0;

        for(Student student : courseStudents){
            studentGrade += student.getGrade();
        }
        return studentGrade/courseStudents.size();
    }*/
}
