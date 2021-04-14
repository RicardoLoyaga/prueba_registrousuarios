package com.pruebaMegaProfer.registrousuarios.persistence;

import com.pruebaMegaProfer.registrousuarios.domain.User;
import com.pruebaMegaProfer.registrousuarios.domain.repository.UserRepository;
import com.pruebaMegaProfer.registrousuarios.persistence.crud.UsuarioCrudRepository;
import com.pruebaMegaProfer.registrousuarios.persistence.entity.Usuario;
import com.pruebaMegaProfer.registrousuarios.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository implements UserRepository {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAll(){
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }

    @Override
    public List<User> getById(int id){
        List<Usuario> usuarios = usuarioCrudRepository.findById(id);
        return mapper.toUsers(usuarios);
    }

    @Override
    public List<User> getByIdentify(String identify) {
        List<Usuario> usuarios = usuarioCrudRepository.findByIdentificacion(identify);
        return mapper.toUsers(usuarios);
    }

    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int id){
        usuarioCrudRepository.deleteById(id);
    }
}
