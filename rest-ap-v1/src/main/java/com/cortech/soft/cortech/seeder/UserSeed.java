package com.cortech.soft.cortech.seeder;

import com.cortech.soft.cortech.dao.UserDAO;
import com.cortech.soft.cortech.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class UserSeed {
    @Autowired
    private UserDAO userDAO ;
    public  void run(){
        User u1 =  new User(null,"papesambandour@hotmail.com","Pape Samba NDOUR","221777293282",1);
        User u2 =  new User(null,"pacodiazs1@outlook.fr","Pape Samba NDOUR","221777293283",1);
        this.userDAO.save(u1);
        this.userDAO.save(u2);
    }
}
