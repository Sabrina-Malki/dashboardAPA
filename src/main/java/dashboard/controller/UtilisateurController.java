package dashboard.controller;

import dashboard.model.*;
import dashboard.repository.PermissionRepo;
import dashboard.repository.RessourceRepo;
import dashboard.repository.RoleRepo;
import dashboard.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Controller
public class UtilisateurController {

    @Autowired
    UtilisateurRepo utilRepo;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    PermissionRepo permissionRepo;

    Utilisateur user = new Utilisateur(); // TODO: Remplacer par l'instance de l'utilisateur

    @RequestMapping("/")
    public String verifierPermission() {
        List<Role> roles;
        List<Permission> permissions;
        String permToFind = "valider";
        boolean permissionExists = false;
        Lot lotRole = new Lot();


        roles = roleRepo.findByUtilisateurs_id(user.getId());
        int i = 0;
        while (i < roles.size() && permissionExists == false )
        {
            lotRole = roles.get(i).getLot();
            permissions = permissionRepo.findByRoles_id(roles.get(i).getId());
            permissionExists = permissions.stream().anyMatch(permission -> permToFind.equalsIgnoreCase(permission.getNom()));
            i++;
        }
        if (permissionExists) {
            getRessourcesValidation(lotRole);
            return null;
        }
        else return "dashboard/generalDashNoAccess.html";
    }

    public ModelAndView getRessourcesValidation(Lot lot) {

        ModelAndView mv = new ModelAndView();
        return  mv;
    }

//    @RequestMapping("/")
//    public String home() {
//        return "dashboard/generalDash.html";
//    }


//    @RequestMapping("/ajout")
//    public String addUser(Utilisateur utilis)
//    {
//      utilRepo.save(utilis);
//      return "dashboard/principale.html";
//    }
}
