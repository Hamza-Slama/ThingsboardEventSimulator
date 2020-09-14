package org.thingsboard.service;

public interface GatewaySimulatorService {

    void pushEvents(String eventType, String gatewayToken, String deviceName);

}
