package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
    public List<Contrat> findAllByCin(String cin);
}
