package org.example.emailService.kafka;

import lombok.extern.slf4j.Slf4j;
import org.example.basedomains.dto.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderConsumer {
    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        log.info(String.format("Order event received in email service => %s", event.toString()));

        // send an email to the customer
    }
}
