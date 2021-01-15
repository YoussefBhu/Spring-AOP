package com.example.demo.Service;

import com.example.demo.DAO.Contrat;

import java.util.List;

public interface ContratService {
    public void ajoutContrat(Contrat c);
    public Contrat ConsulterContrat(long id);
    public List<Contrat> ConsulterContrats(String cinClient);
}
