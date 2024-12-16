package org.sid.controle_ace.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDTO {
    private String name;
    private String email;
    private LocalDate dateNaissance;
}
