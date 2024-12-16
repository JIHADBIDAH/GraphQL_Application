package org.sid.controle_ace.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idStudent;
        private String name;
        private String email;
        private LocalDate dateNaissance;
}
