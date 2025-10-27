package com.tp.jaxrs.repositories;

import com.tp.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}