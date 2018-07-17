package com.api.guispin.yogamanager.controller;

import com.api.guispin.yogamanager.domain.Aluno;
import com.api.guispin.yogamanager.domain.Alunos;
import com.api.guispin.yogamanager.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/private")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/alunos")
    public ResponseEntity<Alunos> getAllAlunos() {
        Alunos alunos = alunoService.getAllAlunos();
        return new ResponseEntity<Alunos>(alunos, HttpStatus.OK);
    };

    @PostMapping ("/alunos")
    public void saveAluno(@RequestBody Aluno aluno) {
        alunoService.saveAluno(aluno);
    }

    @DeleteMapping("/alunos/{id}")
    public void deleteAluno(@PathVariable String id) {
        alunoService.deleteAluno(id);
    }

}
