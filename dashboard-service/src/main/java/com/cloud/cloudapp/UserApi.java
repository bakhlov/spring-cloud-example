package com.cloud.cloudapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserApi {

    @GetMapping("/getUser/{id}")
    UserDTO getUser(@PathVariable("id") Long id);
}
