package com.example.Premise.Presentation.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Premise.Infrastructure.Repository.PremiseRepository;
import com.example.Premise.Models.Premise.PremiseModel;

@RestController
@RequestMapping("/api/premises")
public class PremiseController {
    private final PremiseRepository repository;

    public PremiseController(PremiseRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PremiseModel> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PremiseModel> findById(@PathVariable UUID id) {
        return repository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PremiseModel create(@RequestBody PremiseModel premise) {
        return repository.save(premise);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PremiseModel> update(@PathVariable UUID id, @RequestBody PremiseModel premise) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        premise.setPremiseId(id);
        return ResponseEntity.ok(repository.save(premise));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
