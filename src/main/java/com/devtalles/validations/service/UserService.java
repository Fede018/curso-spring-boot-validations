package com.devtalles.validations.service;

import com.devtalles.validations.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void saveUser(User user){
        System.out.println("Validaciones exitosas... " + user.getName());
    }
}
