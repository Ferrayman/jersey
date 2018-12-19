package com.lilac.jersey.resource;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilac.jersey.model.Student;
import com.lilac.jersey.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students2", method = RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllResource(@Context ServletRequest request) {
        return studentService.getStudents();
    }

}
