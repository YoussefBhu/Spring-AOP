package com.example.demo.DAO;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Contrat {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id ;
    private String titre ;
    private Date date;
    private double montant ;
    private String nomClient;
    private String cin;

    public Contrat(long id, String titre, Date date, double montant, String nomClient, String cin) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.montant = montant;
        this.nomClient = nomClient;
        this.cin = cin;
    }

    public String getNomClient() {
        return nomClient;
    }

    public Contrat() {
    }
}
