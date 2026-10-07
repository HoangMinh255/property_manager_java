package com.example.TicketAndNotification.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketAndNotification.Models.Notification.NotificationRecipientModel;

public interface NotificationRecipientRepository
        extends JpaRepository<NotificationRecipientModel, NotificationRecipientModel.NotificationRecipientModelId> {
    void deleteByIdNotificationId(UUID notificationId);
}
