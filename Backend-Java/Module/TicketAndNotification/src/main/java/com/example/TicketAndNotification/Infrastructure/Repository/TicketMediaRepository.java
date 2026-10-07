package com.example.TicketAndNotification.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketAndNotification.Models.Ticket.TicketMediaModel;

public interface TicketMediaRepository extends JpaRepository<TicketMediaModel, UUID> {
}
