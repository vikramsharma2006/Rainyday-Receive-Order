package com.rainyday.receiveorder.serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.rainyday.receiveorder.model.OrderRequestList;


@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "selected-products";
    

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(OrderRequestList message) {
        logger.info(String.format("#### -> Producing message -> %s",message));
        Map<String, String> map = new HashMap<String, String>();
        this.kafkaTemplate.send(TOPIC, message.toString());
        
        return "Ok";
    }
}
