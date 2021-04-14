package com.pruebaMegaProfer.registrousuarios.domain.service;

import com.pruebaMegaProfer.registrousuarios.domain.User;
import com.pruebaMegaProfer.registrousuarios.domain.repository.UserRepository;
import com.pruebaMegaProfer.registrousuarios.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public List<User> getById(int id){
        return userRepository.getById(id);
    }

    public  List<User> getByIdentify(String identify){
        return userRepository.getByIdentify(identify);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void delete(int id){

    }
    /*public boolean delete(int id){
        return getById(id).map(user -> {
            userRepository.delete(id);
            return true;
        }).orElse(false);
    }*/
}
