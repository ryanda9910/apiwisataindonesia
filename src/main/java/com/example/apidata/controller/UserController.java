package com.example.apidata.controller;


import com.example.apidata.model.UserModel;
import com.example.apidata.view.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping

public class UserController {
    @Autowired

    private UserRepository userRepository;
    @PostMapping(path="/add/users")
    public @ResponseBody String addNewUser(@RequestParam int user_id, @RequestParam String name) {
        UserModel n = new UserModel();
        n.setUser_id(user_id);
        n.setName(name);
        userRepository.save(n);
        return "Data User Has Been Saved";
    }

    @GetMapping(path="/users")
    public @ResponseBody Iterable<UserModel> getAllUsers(){
        return userRepository.findAll();
    }
}
