package org.thingsboard.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.thingsboard.config.ThingsboardMqttClient;
import org.thingsboard.publisher.DeviceType;


@Slf4j
@Service
public class GatewaySimulatorServiceImp implements GatewaySimulatorService {

    @Override
    public void pushEvents(String eventType, String gatewayToken, String deviceName) {
        new ThingsboardMqttClient().pushEvents(DeviceType.GATEWAY.name(), eventType,gatewayToken,deviceName);
    }
}



