package com.abdelkarim.OnlineCourses.Controller;

import com.abdelkarim.OnlineCourses.models.LoginResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adminlogin")
public class AdminLoginController {

    // Méthode qui gère la requête GET /login/{login}/{password}
    @GetMapping("/login/{login}/{password}")
    public LoginResponse login(@PathVariable String login, @PathVariable String password) {
        // Créer un objet LoginResponse
        LoginResponse response = new LoginResponse();
        // Vérifier si le login et le mot de passe sont valides
        if (login.equals("admin") && password.equals("1234")) {
            // Si oui, mettre success à true et message à "Connexion réussie"
            response.setSuccess(true);
            response.setMessage("Connexion réussie");
        } else {
            // Sinon, mettre success à false et message à "Login ou mot de passe incorrect"
            response.setSuccess(false);
            response.setMessage("Login ou mot de passe incorrect");
        }
        // Retourner l'objet LoginResponse au format JSON
        return response;
    }
}


