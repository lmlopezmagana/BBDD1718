package com.salesianostriana.bd.asociaciones.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.asociaciones.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
