package com.example.demo;

import com.example.demo.Aspects.CachableAspect;
import com.example.demo.Aspects.EncCrypt;
import com.example.demo.Aspects.MyLog;
import com.example.demo.DAO.Contrat;
import com.example.demo.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ServiceImpl service;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
    //    service.ajoutContrat(new Contrat(1,"test",new Date(),3000,"youssef","AD289470"));
     //   System.out.println(service.ConsulterContrat(1).getNomClient());
    }
}
