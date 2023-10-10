package br.com.danielcruz.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PrimeiraRota")
public class MinhaPrimeiraController {
    
    /*
        Metodos de Acesso do HTTP
        Get - Busca 
        Post - Adiciona
        Put - Alterar
        Delete - Remover
        Patch - Alterar uma parte
     */
    //Metodo (Funcionalidade) de uma classe
    @GetMapping("/")
    public String PrimeiraMensagem(){
        
        return "Funcionou";
    }
}
