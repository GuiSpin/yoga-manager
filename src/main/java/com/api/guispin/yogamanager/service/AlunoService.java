package com.api.guispin.yogamanager.service;

import com.api.guispin.yogamanager.domain.Aluno;
import com.api.guispin.yogamanager.domain.Alunos;
import com.api.guispin.yogamanager.exception.UnprocessableException;
import com.api.guispin.yogamanager.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService  {

    @Autowired
    AlunoRepository alunoRepository;

    public void saveAluno(Aluno aluno) {

        aluno.setDataCadastro(LocalDateTime.now());

        Optional<Aluno> alunoByCPF = alunoRepository.findByNumeroCPF(aluno.getNumeroCPF());

        if (alunoByCPF.isPresent()) {
            throw new UnprocessableException("Aluno existente");
        }

        alunoRepository.save(aluno);

    }

    public Alunos getAllAlunos() {
        List<Aluno> alunoList = alunoRepository.findAll();
        return new Alunos(alunoList);
    }

    public void updateAluno (Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void deleteAluno(String id) {
        alunoRepository.deleteById(id);
    }
}
