package com.api.guispin.yogamanager.controller;

import com.api.guispin.yogamanager.domain.Aluno;
import com.api.guispin.yogamanager.domain.Alunos;
import com.api.guispin.yogamanager.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/alunos")
    public ResponseEntity<Alunos> getAllAlunos() {
        List<Aluno> listAluno = alunoRepository.findAll();

        Alunos alunos = new Alunos();
        alunos.setAlunos(listAluno);

        return new ResponseEntity<Alunos>(alunos, HttpStatus.OK);
    };

    @PostMapping ("/alunos")
    public void saveAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

}
