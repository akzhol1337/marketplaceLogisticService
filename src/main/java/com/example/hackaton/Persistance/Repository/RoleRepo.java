package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
