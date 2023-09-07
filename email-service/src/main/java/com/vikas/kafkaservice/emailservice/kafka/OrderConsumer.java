package com.vikas.kafkaservice.emailservice.kafka;

import com.vikas.kafkaservice.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumeOrder(OrderEvent orderEvent) {
        LOGGER.info(String.format("Order event received in Email service => %s", orderEvent.toString()));

        // save to database
    }

}
