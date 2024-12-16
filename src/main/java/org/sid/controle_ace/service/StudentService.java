package org.sid.controle_ace.service;

import org.sid.controle_ace.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    public StudentDTO saveStudent(StudentDTO studentDTO);

    public boolean deleteStudent(Long id);

    public List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance);

    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOs);
}
