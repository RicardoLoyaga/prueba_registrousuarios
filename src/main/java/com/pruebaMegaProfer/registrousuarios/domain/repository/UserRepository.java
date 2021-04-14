package com.pruebaMegaProfer.registrousuarios.domain.repository;

import com.pruebaMegaProfer.registrousuarios.domain.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
    List<User> getById(int userId);
    List<User> getByIdentify(String identify);
    User save(User user);
    void delete(int userId);
}
