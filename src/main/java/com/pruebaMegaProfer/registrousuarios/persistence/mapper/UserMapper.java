package com.pruebaMegaProfer.registrousuarios.persistence.mapper;

import com.pruebaMegaProfer.registrousuarios.domain.User;
import com.pruebaMegaProfer.registrousuarios.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "identificacion", target = "identify"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "edad", target = "age"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "contrasena", target = "password"),
            @Mapping(source = "ciudad", target = "city"),
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
