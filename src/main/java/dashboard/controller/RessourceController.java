package dashboard.controller;

import dashboard.repository.RessourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class RessourceController {

    @Autowired
    RessourceRepo resRepo;

}
