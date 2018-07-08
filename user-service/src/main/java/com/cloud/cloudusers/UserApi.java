package com.cloud.cloudusers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserApi {


    @GetMapping("/getUser/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        UserDTO target = new UserDTO();
        target.setId(id);
        return target;
    }

}