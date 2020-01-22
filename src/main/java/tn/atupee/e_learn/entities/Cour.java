package tn.atupee.e_learn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cour {

    @Id
    private String id ;
    private String Auteur ;
    private Date date_ajout ;
    private double prix ;
    private String fichier_pdf;






}

