package com.lilac.jersey.dao;

import java.util.List;

import com.lilac.jersey.model.Student;

public interface StudentDao {

    Student getStudent(int id);

    List<Student> getStudents();

    int addStudent(Student student);

    boolean updateStudent(Student student);

    boolean deleteStudent(int id);

}
