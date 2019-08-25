package dashboard.controller;

import dashboard.model.*;
import dashboard.repository.PermissionRepo;
import dashboard.repository.RoleRepo;
import dashboard.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UtilisateurController {

     @Autowired
     UtilisateurRepo utilRepo;
     @Autowired
     RoleRepo roleRepo;
     @Autowired
    PermissionRepo permissionRepo;
     List<Role> roles;
     List<Permission> permissions;
     List<String> permission_nom;
     String permToFind = "valider";
     Utilisateur user = new Utilisateur(); // TODO: Remplacer par l'instance de l'utilisateur

     @RequestMapping("/")
     public String verifierPermission() {

           roles = roleRepo.findByUtilisateurs_id(user.getId());
           for (Role r : roles) {
               permissions = permissionRepo.findByRoles_id(r.getId());
               boolean permissionExists = permissions.stream().anyMatch(permission -> permToFind.equalsIgnoreCase(permission.getNom()));
               if (permissionExists) return "dashboard/generalDash.html";
               else return "dashboard/generalDashNoAccess.html";
           }
           return null;
     }
//    @RequestMapping("/x")
//    public String home() {
//
//        for (Long rid : utilRepo.findRolesUtilisateurs(user.getId()))
//        {
//        utilRepo.findPermissionsRoles(rid);
//        System.out.println("hey");
//        }
//        return "dashboard/generalDash.html";
//    }


//    @RequestMapping("/ajout")
//    public String addUser(Utilisateur utilis)
//    {
//      utilRepo.save(utilis);
//      return "dashboard/principale.html";
//    }
}
