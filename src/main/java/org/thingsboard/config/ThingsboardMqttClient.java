package org.thingsboard.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.thingsboard.publisher.FactoryFakePublisher;

import javax.annotation.PostConstruct;

import static org.thingsboard.Utils.Utils.TELEMETRY_TOPIC_GATEWAY;


@Slf4j
@Component
public class ThingsboardMqttClient {

    private static String tbMqttBroker;

    @Value("${thingsboard.mqtt.broker}")
    public void setTbMqttBroker(String tbMqttBroker) {
        this.tbMqttBroker = tbMqttBroker;
    }

    public ThingsboardMqttClient() {
    }

    @PostConstruct
    public void init() {
    }

    public void pushEvents(String deviceType, String eventType, String deviceToken, String deviceName) {
        String clientId = "sample";
        log.info(tbMqttBroker);
        MemoryPersistence persistence = new MemoryPersistence();
        try {
            MqttConnectOptions connOpt;
            connOpt = new MqttConnectOptions();
            connOpt.setCleanSession(true);
            connOpt.setKeepAliveInterval(3600000);
            connOpt.setConnectionTimeout(99999999);
            connOpt.setUserName(deviceToken);
            org.eclipse.paho.client.mqttv3.MqttClient sampleClient = new org.eclipse.paho.client.mqttv3.MqttClient(tbMqttBroker, clientId, persistence);
            log.info("Connecting to broker using " + deviceToken);
            sampleClient.connect(connOpt);
            MqttMessage message = new MqttMessage();
            message.setPayload(new FactoryFakePublisher().getEventToPublish(deviceType, eventType, deviceName).getBytes());
            sampleClient.publish(TELEMETRY_TOPIC_GATEWAY, message);
            log.info("Message Published with event Type {}", eventType);
        } catch (MqttException | JsonProcessingException e) {
            log.info("msg " + e.getMessage());
            log.info("loc " + e.getLocalizedMessage());
            log.info("cause " + e.getCause());
            log.info("exxcep " + e);
        }
    }
}
