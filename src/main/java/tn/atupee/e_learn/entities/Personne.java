package tn.atupee.e_learn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {

    @Id
    private String id ;
    private String nom ;
    private String prenom ;
    private String cin ;
    private Date date_naissance ;
    private String niveau_etude ;
    private String profession ;
    private String previllege ;
    private double salaire ;
    private String nom_log ;
    private String nom_pass ;
    @DBRef
    private Collection <Formation> formations = new ArrayList<>();
}
