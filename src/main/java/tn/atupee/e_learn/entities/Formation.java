package tn.atupee.e_learn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {

    @Id
    private String id ;
    private String formateur ;
    private double prix ;
    private String image ;
    @DBRef
    private Collection<Seance> seances = new ArrayList<>();


}
