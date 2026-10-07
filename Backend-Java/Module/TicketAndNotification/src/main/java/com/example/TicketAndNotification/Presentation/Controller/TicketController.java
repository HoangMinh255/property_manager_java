package com.example.TicketAndNotification.Presentation.Controller;

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

import com.example.TicketAndNotification.Infrastructure.Repository.TicketRepository;
import com.example.TicketAndNotification.Models.Ticket.TicketModel;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketRepository repository;

    public TicketController(TicketRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<TicketModel> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketModel> findById(@PathVariable UUID id) {
        return repository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TicketModel create(@RequestBody TicketModel ticket) {
        return repository.save(ticket);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TicketModel> update(@PathVariable UUID id, @RequestBody TicketModel ticket) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        ticket.setTicketId(id);
        return ResponseEntity.ok(repository.save(ticket));
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
