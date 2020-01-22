package tn.atupee.e_learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.atupee.e_learn.entities.Personne;

public interface Personne_repository extends MongoRepository <Personne,String> {
}
