package com.abdelkarim.OnlineCourses.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminResponseDTO {


    private Integer id;
    private String ref;
    private String nom;
    private String prenom;
    private String mail;
    private String password;

}

