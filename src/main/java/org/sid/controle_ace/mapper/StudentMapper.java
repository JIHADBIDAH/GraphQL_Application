package org.sid.controle_ace.mapper;

import org.sid.controle_ace.dao.entities.Student;
import org.sid.controle_ace.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private static final ModelMapper modelMapper = new ModelMapper();
    public StudentDTO toDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}

