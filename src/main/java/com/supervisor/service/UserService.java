package com.supervisor.service;

import com.supervisor.entity.UserJPA;

import java.util.List;

public interface UserService {
    List<UserJPA.UserDTO> getUserIdsByRole(String role);
}
