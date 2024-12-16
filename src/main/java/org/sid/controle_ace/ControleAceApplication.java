package org.sid.controle_ace;

import org.sid.controle_ace.dto.StudentDTO;
import org.sid.controle_ace.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ControleAceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleAceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDTO.builder().name("Ahmed").dateNaissance(LocalDate.parse("2000-01-01")).email("ahmed@gmail.com").build(),
                            StudentDTO.builder().name("Fatima").dateNaissance(LocalDate.parse("1999-05-12")).email("fatima@gmail.com").build(),
                            StudentDTO.builder().name("Youssef").dateNaissance(LocalDate.parse("2001-03-20")).email("youssef@gmail.com").build(),
                            StudentDTO.builder().name("Khadija").dateNaissance(LocalDate.parse("2002-07-15")).email("khadija@gmail.com").build()
                    )
            );
        };
    }
}
