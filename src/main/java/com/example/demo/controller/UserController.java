package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Map<String, Boolean> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        // 这里可以加入登录逻辑，例如校验用户名和密码
        return Map.of("success", true);
    }
}
