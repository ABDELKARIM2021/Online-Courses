package com.abdelkarim.OnlineCourses.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminLoginRequestDTO {

    private String mail;

    private String password;

}
