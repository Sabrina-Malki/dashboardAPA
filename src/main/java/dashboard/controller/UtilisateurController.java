package dashboard.controller;

import dashboard.model.*;
import dashboard.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurController {

    @Autowired
    UtilisateurRepo utilRepo;

    @RequestMapping("/")
    public String home() {
        return "dashboard/generalDash.html";
    }

    @RequestMapping("/ajout")
    public String addUser(Utilisateur utilis)
    {
      utilRepo.save(utilis);
      return "dashboard/principale.html";
    }
}
