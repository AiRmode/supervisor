package com.supervisor.service.impl;

import com.supervisor.entity.UserJPA;
import com.supervisor.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserJPA.UserDTO> getUserIdsByRole(String role) {
        List<UserJPA.UserDTO> devJiraUsers = new ArrayList<>();
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("bserenkov")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("atroschiy")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("gvelchev")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("itananushko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("vbashtovyi")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("oivanchenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("apokhodun")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("yradov")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("izhavoronkin")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("divanov")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("vkorolenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("dparkhomenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("amaksimenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("dkumaka")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("ahryshchuk")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("apasyshen")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("eavatov")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("arumyantseva")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("ikrysenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("agricenko")));
        devJiraUsers.add(new UserJPA.UserDTO(new UserJPA("akultepin")));

        return devJiraUsers;
    }
}
