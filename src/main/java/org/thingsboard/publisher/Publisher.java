package org.thingsboard.publisher;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Publisher {
    public String publishGatewayMessage(String deviceName) throws JsonProcessingException;

    public String publishDeviceMessage(String deviceName) throws JsonProcessingException;
}
