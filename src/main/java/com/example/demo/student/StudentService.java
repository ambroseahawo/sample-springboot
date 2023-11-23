package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Hassan",
                        "hassana@yahoo.com",
                        LocalDate.of(1994, Month.FEBRUARY, 22),
                        33
                )
        );
    }
}
