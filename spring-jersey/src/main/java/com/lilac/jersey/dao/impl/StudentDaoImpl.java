package com.lilac.jersey.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lilac.jersey.dao.StudentDao;
import com.lilac.jersey.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public Student getStudent(int id) {
        return new Student(9527, "zhouxingchi", "Hong Kong");
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(9527, "zhouxingchi", "Hong Kong"));
        list.add(new Student(033, "zhengxiuwen", "Hong Kong"));
        list.add(new Student(12015211, "zhux", "chengdu"));
        return list;
    }

    @Override
    public int addStudent(Student student) {
        return 11;
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }

}
