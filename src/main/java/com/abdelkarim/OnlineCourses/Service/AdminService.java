package com.abdelkarim.OnlineCourses.Service;

import com.abdelkarim.OnlineCourses.DAO.AdminDAO;
import com.abdelkarim.OnlineCourses.DTO.AdminLoginRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private AdminDAO adminDAO;

    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    public boolean checkLogin(AdminLoginRequestDTO adminLoginRequestDTO) {
        // Récupérer l'email et le mot de passe saisis par l'utilisateur
        String email = adminLoginRequestDTO.getMail();
        String password = adminLoginRequestDTO.getPassword();
        // Comparer avec ceux de l'admin
        if (email.equals("elouaddany.abdelkarim@ensam-casa.ma") && password.equals("1234")) {
            // Si c'est le même, retourner true
            return true;
        } else {
            // Sinon, retourner false
            return false;
        }
    }

}
