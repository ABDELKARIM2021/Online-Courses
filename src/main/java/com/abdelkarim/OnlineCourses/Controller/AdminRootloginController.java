package com.abdelkarim.OnlineCourses.Controller;


import com.abdelkarim.OnlineCourses.DTO.AdminLoginRequestDTO;
import com.abdelkarim.OnlineCourses.DTO.AdminLoginResponseDTO;
import com.abdelkarim.OnlineCourses.Service.AdminService;
import com.abdelkarim.OnlineCourses.Service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("adminlogin")
@CrossOrigin
public class AdminRootloginController{


    private AdminService adminService;

    public AdminRootloginController(AdminService adminService) {
        this.adminService = adminService;
    }


    @PostMapping("/login")
    public AdminLoginResponseDTO login(@RequestBody AdminLoginRequestDTO adminLoginRequestDTO, HttpServletRequest request) {

        // Appeler le service pour vérifier le login et le mot de passe
        boolean valid = adminService.checkLogin(adminLoginRequestDTO);


        AdminLoginResponseDTO adminLoginResponseDTO = new AdminLoginResponseDTO();
// Si le login et le mot de passe sont valides, mettre success à true et message à "Connexion réussie"
        if (valid) {
            adminLoginResponseDTO.setSuccess(true);
            adminLoginResponseDTO.setMessage("Connexion réussie");
            System.out.println("reussi");
        } else {
            // Sinon, mettre success à false et message à "Login ou mot de passe incorrect"
            adminLoginResponseDTO.setSuccess(false);
            adminLoginResponseDTO.setMessage("Login ou mot de passe incorrect");
        }
        // Si le login et le mot de passe sont valides, créer ou récupérer la session
        if (valid) {
            HttpSession session = request.getSession();
            // Stocker l'email de l'utilisateur dans la session
            session.setAttribute("email", adminLoginRequestDTO.getMail());
        }


        return adminLoginResponseDTO;
    }
}

