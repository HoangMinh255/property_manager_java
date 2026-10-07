package com.example.TicketAndNotification.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketAndNotification.Models.Ticket.TicketModel;

public interface TicketRepository extends JpaRepository<TicketModel, UUID> {
}
