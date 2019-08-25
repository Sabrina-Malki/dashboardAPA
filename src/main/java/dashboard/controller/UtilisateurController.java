package dashboard.controller;

import dashboard.model.*;
import dashboard.repository.RoleRepo;
import dashboard.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UtilisateurController {

     @Autowired
     UtilisateurRepo utilRepo;
     @Autowired
     RoleRepo roleRepo;
     List<Role> roles = new ArrayList<>();

     @RequestMapping("/")
     public String test() {
//         Role role= new Role("role1");
//         Role role2= new Role("role2");
//         roleRepo.deleteById(2L);
//         roles.add(role);
//         roleRepo.save(role);
//         roles.add(role2);
//         roleRepo.save(role2);
//         Utilisateur user = new Utilisateur("smith", "sam", true, "sams", "xyz", "url", roles);
//         utilRepo.deleteById(11L);
//         utilRepo.save(user);

           roles = roleRepo.findByUtilisateurs_id(14L);
           System.out.println(roles.get(0).getId()+" hey "+roles.get(1).getId());
         return "dashboard/generalDash.html";
     }
//    @RequestMapping("/x")
//    public String home() {
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
