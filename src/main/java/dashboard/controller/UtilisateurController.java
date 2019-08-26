package dashboard.controller;

import dashboard.model.*;
import dashboard.repository.*;
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
    @Autowired
    RessourceRepo ressourceRepo;


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
        ModelAndView mv = new ModelAndView("dashboard/generalDash.html");
        List<Ressource> RessourcesEnAttente;
        List<Ressource> RessourcesValidees;
        List<Ressource> RessourcesNonValidees;
        int nbrEnAttente;
        int nbrValidees;
        int nbrNonValidees;

        RessourcesEnAttente = ressourceRepo.findByClassifications_Lot_idAndEtat(lot.getId(),"enAttente");
        RessourcesValidees = ressourceRepo.findByClassifications_Lot_idAndEtat(lot.getId(),"validee");
        RessourcesNonValidees = ressourceRepo.findByClassifications_Lot_idAndEtat(lot.getId(),"nonValidee");
        nbrEnAttente = RessourcesEnAttente.size();
        nbrValidees = RessourcesValidees.size();
        nbrNonValidees = RessourcesNonValidees.size();
        mv.addObject(nbrEnAttente);
        mv.addObject(nbrValidees);
        mv.addObject(nbrNonValidees);
        return  mv;
    }

//    @RequestMapping("/")
//    public String home() {
//        List<Classification> cl;
//        Classification c;
//        c.setLot();
//        cl.add();
//        Ressource res = new Ressource();
//        classificationRepo.save(cl);
//        res.setNbr_consultation(1);
//        res.setPopulation(2);
//        res.setClassifications(cl);
//        return "dashboard/generalDash.html";
//    }


//    @RequestMapping("/ajout")
//    public String addUser(Utilisateur utilis)
//    {
//      utilRepo.save(utilis);
//      return "dashboard/principale.html";
//    }
}
