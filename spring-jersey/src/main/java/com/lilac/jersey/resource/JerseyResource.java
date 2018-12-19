package com.lilac.jersey.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.lilac.jersey.model.Department;
import com.lilac.jersey.model.Student;
import com.lilac.jersey.service.StudentService;

/**
 * 
 * <p>
 * First jersey application
 * </p>
 * @author ${Author}
 * @version ${Version}
 * @since 9.1.0
 *
 */
@Path("")
public class JerseyResource {

    @Autowired
    private StudentService studentService;

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllResource(@Context ServletRequest request) {
        return studentService.getStudents();
    }

    @GET
    @Path("/students/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student getResource(@PathParam("id") int id) {
        return studentService.getStudent(id);
    }

    @POST
    @Path("/students/{person}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int addResource(Student student) throws IOException {
        return studentService.addStudent(student);
    }

    @Path("dept")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Department> list() {
        List<Department> dept = new ArrayList<>();
        dept.add(new Department(1L, "dept1"));
        dept.add(new Department(2L, "dept2"));
        return dept;
    }

}
