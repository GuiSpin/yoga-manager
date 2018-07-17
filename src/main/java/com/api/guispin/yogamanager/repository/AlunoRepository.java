package com.api.guispin.yogamanager.repository;

import com.api.guispin.yogamanager.domain.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AlunoRepository extends MongoRepository<Aluno,Long> {
}
