package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        if (Objects.equals(username, "js") && Objects.equals(password, "22")) {
            Map<String, Object> map = new HashMap<>();
            map.put("success", true);
            map.put("token", 123);
            return map;
        } else {
            return Map.of("success", false);
        }
        // 这里可以加入登录逻辑，例如校验用户名和密码
    }
}
