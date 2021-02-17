package com.cortech.soft.cortech.seeder;

import com.cortech.soft.cortech.dao.GroupeDAO;
import com.cortech.soft.cortech.dao.UserDAO;
import com.cortech.soft.cortech.model.Groupe;
import com.cortech.soft.cortech.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class GroupeSeed {
    @Autowired
    private GroupeDAO groupeDAO ;
    @Autowired
    private UserDAO userDAO ;
    public  void run(){
        User u1 = userDAO.findByEmail("papesambandour@hotmail.com");
        Groupe g1 =  new Groupe(null,"Client Cortech",1,u1);
        this.groupeDAO.save(g1);
    }
}
