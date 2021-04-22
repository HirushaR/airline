package com.aerotravel.flightticketbooking.repository;


import com.aerotravel.flightticketbooking.model.Role;
import com.aerotravel.flightticketbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   // Optional<User> findByUsername(String username);
   User findByUsername(String username);

    User findById(int id);

    List<User> findAllByRoles(Role role);



}
