package org.sid.controle_ace.web;

import lombok.AllArgsConstructor;
import org.sid.controle_ace.dto.StudentDTO;
import org.sid.controle_ace.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private final StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }

    @MutationMapping
    public Boolean deleteStudent(@Argument Long id) {
        return studentService.deleteStudent(id);
    }

    @QueryMapping
    public List<StudentDTO> getStudentsByDateNaissance(@Argument String date) {
        LocalDate localDate = LocalDate.parse(date);
        return studentService.getStudentsByDateNaissance(localDate);
    }
}

