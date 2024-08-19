package com.chechpoint2JAVA.java2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository brinqueRepo;

    // Listar todos os brinquedos
    @GetMapping
    public ResponseEntity<List<Brinquedo>> listarBrinquedos() {
        List<Brinquedo> brinquedos = (List<Brinquedo>) brinqueRepo.findAll();
        return ResponseEntity.ok(brinquedos);
    }

    // Obter um brinquedo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> obterBrinquedoPorId(@PathVariable Long id) {
        Optional<Brinquedo> brinquedoOpt = brinqueRepo.findById(id);
        return brinquedoOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Adicionar um novo brinquedo
    @PostMapping("/adicionar")
    public ResponseEntity<Brinquedo> adicionarBrinquedo(@RequestBody Brinquedo brinquedo) {
        Brinquedo novoBrinquedo = brinqueRepo.save(brinquedo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoBrinquedo);
    }

    // Atualizar um brinquedo existente
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Brinquedo> atualizarBrinquedo(@PathVariable Long id, @RequestBody Brinquedo brinquedoAtualizado) {
        return brinqueRepo.findById(id)
                .map(brinquedo -> {
                    brinquedo.setNome(brinquedoAtualizado.getNome());
                    brinquedo.setTipo(brinquedoAtualizado.getTipo());
                    brinquedo.setClassificacao(brinquedoAtualizado.getClassificacao());
                    brinquedo.setTamanho(brinquedoAtualizado.getTamanho());
                    brinquedo.setPreco(brinquedoAtualizado.getPreco());
                    Brinquedo brinquedoSalvo = brinqueRepo.save(brinquedo);
                    return ResponseEntity.ok(brinquedoSalvo);
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Excluir um brinquedo
    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluirBrinquedo(@PathVariable Long id) {
        if (brinqueRepo.existsById(id)) {
            brinqueRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
