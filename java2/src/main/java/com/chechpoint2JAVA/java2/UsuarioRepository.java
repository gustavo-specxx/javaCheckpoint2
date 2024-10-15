package com.chechpoint2JAVA.java2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

    Usuario findByUsername(String username);
}
