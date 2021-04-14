package com.pruebaMegaProfer.registrousuarios.persistence.crud;

import com.pruebaMegaProfer.registrousuarios.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findById(int id);
    List<Usuario> findByIdentificacion(String identificacion);
}
