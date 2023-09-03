package com.abdelkarim.OnlineCourses.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(HttpServletRequest request) {
        // Récupérer la session
        HttpSession session = request.getSession();
        // Vérifier si la session existe
        if (session == null) {
            // Afficher un message d'erreur
            System.out.println("La session n'existe pas");
            // Renvoyer une page d'erreur ou rediriger vers la page de login
            return "error.html";
        }
        // Récupérer l'email de la session
        String email = (String) session.getAttribute("email");
        // Vérifier si l'email existe et si il est égal à celui de l'admin
        if (email == null || !email.equals("elouaddany.abdelkarim@ensam-casa.ma")) {
            // Afficher un message d'erreur
            System.out.println("L'email de la session est invalide");
            // Renvoyer une page d'erreur ou rediriger vers la page de login
            return "error.html";
        }
        // Si tout est ok, renvoyer la page HTML du dashboard
        return "dashboard.html";
    }
}










