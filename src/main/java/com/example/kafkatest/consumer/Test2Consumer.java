package com.example.kafkatest.consumer;

import org.apache.kafka.common.TopicPartition;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Test2Consumer implements ConsumerSeekAware {

  /*  @KafkaListener(topics = "test-topic", groupId = "foo")
    public void listen(@Payload String message, @Header(KafkaHeaders.OFFSET) Long offset) {
        System.out.println(offset);
        System.out.println(message);
    }

    // 여기서 seek 메서드를 이용하여, 토픽명, 특정 파티션, 오프셋을 지정하면 해당 오프셋부터 메시지를 수신하기 시작한다
    @Override
    public void onPartitionsAssigned(Map<TopicPartition, Long> assignments, ConsumerSeekCallback callback) {
        assignments.keySet().forEach(partition -> callback.seek("test-topic", 0, 4));
    }*/

}
