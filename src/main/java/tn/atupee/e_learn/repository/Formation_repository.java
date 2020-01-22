package tn.atupee.e_learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.atupee.e_learn.entities.Formation;

public interface Formation_repository extends MongoRepository <Formation,String> {
}
