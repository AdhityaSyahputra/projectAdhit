package Notification_Service.feature.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @KafkaListener(topics = "orders", groupId = "order-group")
    public void listenOrderNotifications(String message) {
        System.out.println("Received message: " + message);
    }
}
