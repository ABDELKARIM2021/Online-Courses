package com.abdelkarim.OnlineCourses.Controller;

import com.abdelkarim.OnlineCourses.DTO.StudentRequestDTO;
import com.abdelkarim.OnlineCourses.DTO.StudentResponseDTO;
import com.abdelkarim.OnlineCourses.Service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
@CrossOrigin
public class RegisterController {

    // Injecter le service
    private StudentService studentService;

    public RegisterController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Méthode qui gère la requête POST /register
    @PostMapping("/register")
    public StudentResponseDTO register(@RequestBody StudentRequestDTO studentRequestDTO) {
        // Appeler le service pour enregistrer le nouveau student
        return studentService.save(studentRequestDTO);
    }
}
