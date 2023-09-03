package com.abdelkarim.OnlineCourses.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StudentRequestDTO {

    private String nom;
    private String prenom;
    private String mail;
    private String password;
}
