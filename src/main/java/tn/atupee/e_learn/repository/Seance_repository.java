package tn.atupee.e_learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.atupee.e_learn.entities.Seance;

public interface Seance_repository extends MongoRepository<Seance,String> {
}
