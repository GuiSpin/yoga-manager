package com.api.guispin.yogamanager.repository;

import com.api.guispin.yogamanager.domain.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface AlunoRepository extends MongoRepository<Aluno,String> {

    public Optional<Aluno> findByNumeroCPF(String numeroCPF);

}
