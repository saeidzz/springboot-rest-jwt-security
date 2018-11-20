package com.surena.angular.jwt.rest.restsecure.Repo;

import com.surena.angular.jwt.rest.restsecure.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String roleName);

}
