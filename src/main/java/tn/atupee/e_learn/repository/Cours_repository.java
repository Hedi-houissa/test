package tn.atupee.e_learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.atupee.e_learn.entities.Cour;

public interface Cours_repository extends MongoRepository <Cour , String> {
}
