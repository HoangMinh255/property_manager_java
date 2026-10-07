package com.example.TicketAndNotification.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketAndNotification.Models.Notification.NotificationModel;

public interface NotificationRepository extends JpaRepository<NotificationModel, UUID> {
}
