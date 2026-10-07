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

import com.example.TicketAndNotification.Infrastructure.Repository.NotificationRepository;
import com.example.TicketAndNotification.Models.Notification.NotificationModel;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationRepository repository;

    public NotificationController(NotificationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<NotificationModel> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificationModel> findById(@PathVariable UUID id) {
        return repository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public NotificationModel create(@RequestBody NotificationModel notification) {
        return repository.save(notification);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NotificationModel> update(@PathVariable UUID id,
            @RequestBody NotificationModel notification) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        notification.setNotificationId(id);
        return ResponseEntity.ok(repository.save(notification));
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
