package com.tp.jaxrs;

import com.tp.jaxrs.entities.Compte;
import com.tp.jaxrs.entities.TypeCompte;
import com.tp.jaxrs.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JaxRsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaxRsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(Math.random()*9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(Math.random()*9000, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(Math.random()*9000, new Date(), TypeCompte.EPARGNE));

            compteRepository.findAll().forEach(c -> {
                System.out.println(c.toString());
            });
        };
    }
}