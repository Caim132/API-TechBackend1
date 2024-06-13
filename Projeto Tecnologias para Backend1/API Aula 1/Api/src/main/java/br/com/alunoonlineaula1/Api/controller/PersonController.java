package br.com.alunoonlineaula1.Api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PersonController {

    @GetMapping("/nome")
    @ResponseStatus(HttpStatus.OK)
    public String exibirNome() {
        return "Dilba";
    }
}
