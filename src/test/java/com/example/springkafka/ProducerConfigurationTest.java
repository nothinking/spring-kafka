package com.example.springkafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProducerConfigurationTest {

    @Autowired
    KafkaTemplate<String, Bye> kafkaTemplate;

    @Test
    void test() {
        kafkaTemplate.send("default_ksql_processing_log", new Bye("test"));
    }

}