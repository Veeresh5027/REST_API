package com.veeresh.blog.repositories;

import com.veeresh.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
