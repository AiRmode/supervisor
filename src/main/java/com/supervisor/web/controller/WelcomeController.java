package com.supervisor.web.controller;

import com.atlassian.connect.spring.AtlassianHostUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/atlaskit")
    public String helloWorld1(@AuthenticationPrincipal AtlassianHostUser user) {
        return "atlaskit";
    }
}