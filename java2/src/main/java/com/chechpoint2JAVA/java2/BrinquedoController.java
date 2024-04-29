package com.chechpoint2JAVA.java2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository brinqueRepo;

    // Listar todos os brinquedos
    @GetMapping
    public List<Brinquedo> listarBrinquedos() {
        return (List<Brinquedo>) brinqueRepo.findAll();
    }

    // Adicionar um novo brinquedo
    @PostMapping("/adicionar")
    public Brinquedo adicionarBrinquedo(@RequestBody Brinquedo brinquedo) {
        return brinqueRepo.save(brinquedo);
    }
}