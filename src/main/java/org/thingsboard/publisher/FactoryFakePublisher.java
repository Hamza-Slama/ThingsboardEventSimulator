package org.thingsboard.publisher;

import com.fasterxml.jackson.core.JsonProcessingException;

public class FactoryFakePublisher {

    public FactoryFakePublisher() {
    }

    public String getEventToPublish(String deviceType, String eventType, String deviceName) throws JsonProcessingException {

        switch(DeviceType.valueOf(deviceType)) {
            case DEVICE:
                switch (EventType.valueOf(eventType)) {

                    case TRANSPORTATION:
                        return new TransportPublisher().publishDeviceMessage(deviceName);
                    default:
                        return "";
                }
            case GATEWAY:
                switch (EventType.valueOf(eventType)) {

                    case TRANSPORTATION:
                        return new TransportPublisher().publishGatewayMessage(deviceName);
                    default:
                        return "";
                }
            default:
        }
        return  "";

    }


}
