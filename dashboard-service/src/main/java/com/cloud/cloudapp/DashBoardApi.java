package com.cloud.cloudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DashBoardApi {

    @Autowired
    private UserApi userApi;

    @GetMapping("/getDashboard/{id}")
    public DashBoardDTO getDashboard(@PathVariable Long id) {
        UserDTO user = userApi.getUser(id);

        DashBoardDTO dashboard = new DashBoardDTO();
        dashboard.setUserDTO(user);

        return dashboard;
    }
}