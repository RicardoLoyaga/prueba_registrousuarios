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

    public List<User> getById(int userId){
        return userRepository.getById(userId);
    }

    public  List<User> getByIdentify(String identify){
        return userRepository.getByIdentify(identify);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void delete(int userId){

    }

    /*public boolean delete(int id){
        if (getById(id).isPresent()){
            userRepository.delete(id);
            return true;
        }else{
            return false;
        }
    }*/
}
