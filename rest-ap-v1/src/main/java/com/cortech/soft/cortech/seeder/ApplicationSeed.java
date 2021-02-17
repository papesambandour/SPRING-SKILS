package com.cortech.soft.cortech.seeder;

import com.cortech.soft.cortech.dao.UserDAO;
import com.cortech.soft.cortech.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ApplicationSeed {
    @Autowired
    UserSeed userSeed ;
    @Autowired
    GroupeSeed groupeSeed ;
    public void seed (){
        userSeed.run();
        groupeSeed.run();
    }

}
