package com.example.demo.Service;

import com.example.demo.Aspects.CachableAspect;
import com.example.demo.Aspects.EncCrypt;
import com.example.demo.Aspects.MyLog;
import com.example.demo.DAO.Contrat;
import com.example.demo.DAO.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ContratService{

    @Autowired
    private ContratRepository contratRepository;

    @Override
    @MyLog
    public void ajoutContrat(Contrat c) {contratRepository.save(c); }

    @Override
    public Contrat ConsulterContrat(long id) {
        return contratRepository.getOne(id);
    }

    @Override
    public List<Contrat> ConsulterContrats(String cinClient) {
        return contratRepository.findAllByCin(cinClient);
    }
}
