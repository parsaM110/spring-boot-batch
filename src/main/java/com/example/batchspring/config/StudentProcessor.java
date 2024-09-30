package com.example.batchspring.config;

import com.example.batchspring.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        // all business logic goes here
        student.setId(null); //id no matter what is in the csv file, we want to generate a new id
        return student;
    }

}
