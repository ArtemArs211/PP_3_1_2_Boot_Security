package ru.kata.spring.boot_security.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entitys.Role;

import java.util.Optional;

@Repository
    public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByRoleName(String name);
}

