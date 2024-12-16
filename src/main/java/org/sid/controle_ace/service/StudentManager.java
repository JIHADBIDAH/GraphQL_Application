package org.sid.controle_ace.service;

import org.sid.controle_ace.dao.entities.Student;
import org.sid.controle_ace.dao.repositories.StudentRepository;
import org.sid.controle_ace.dto.StudentDTO;
import lombok.AllArgsConstructor;
import org.sid.controle_ace.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toDTO(student);
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            studentDTOs.add(studentMapper.toDTO(student));
        }
        return studentDTOs;
    }

    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOs) {
        List<Student> students = new ArrayList<>();
        for (StudentDTO studentDTO : studentDTOs) {
            students.add(studentMapper.toEntity(studentDTO));
        }

        students = studentRepository.saveAll(students);

        List<StudentDTO> savedDTOs = new ArrayList<>();
        for (Student student : students) {
            savedDTOs.add(studentMapper.toDTO(student));
        }
        return savedDTOs;
    }
}

