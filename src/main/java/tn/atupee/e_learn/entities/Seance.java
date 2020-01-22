package tn.atupee.e_learn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.sql.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seance {

    @Id
    private String id ;
    private Date date ;
    private Time heur ;
    private String lieu ;
    private Cour support_cour ;
}
