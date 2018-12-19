package com.lilac.jersey.service;

import java.util.List;

import com.lilac.jersey.model.Student;

public interface StudentService {

    Student getStudent(int id);

    List<Student> getStudents();

    int addStudent(Student student);

    boolean updateStudent(Student student);

    boolean deleteStudent(String id);

}
