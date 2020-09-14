package org.thingsboard.publisher;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.thingsboard.Utils.JsonConverter;
import org.thingsboard.model.Transportation;
import java.util.List;
import java.util.Random;

public class TransportPublisher implements Publisher {
    private List<Transportation> transportationList = JsonConverter.getTravelData();

    @Override
    public String publishGatewayMessage(String deviceName) throws JsonProcessingException {
        return new JsonConverter<Transportation>().formatMessage(getRandomTransportationEvent(), deviceName);
    }

    @Override
    public String publishDeviceMessage(String deviceName) throws JsonProcessingException {
        return null;
    }

    public Transportation getRandomTransportationEvent() {
        return transportationList.get(new Random().nextInt(transportationList.size()));
    }
}
