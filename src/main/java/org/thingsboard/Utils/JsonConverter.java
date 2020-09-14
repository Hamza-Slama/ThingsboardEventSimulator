package org.thingsboard.Utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.thingsboard.model.Sender;
import org.thingsboard.model.Transportation;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class JsonConverter<T> {

    public static ObjectMapper mapper = new ObjectMapper();

    public String formatMessage(T input,String deviceName) throws JsonProcessingException {
        List<T> listOfEvent = new ArrayList<>();
        listOfEvent.add(input);
        Map<String, List<T>> mapOfEvents = new HashMap<>();
        mapOfEvents.put(deviceName, listOfEvent);
        Sender<T> sender = new Sender<>(mapOfEvents);
        String jsonString = mapper.writeValueAsString(sender.listOfMsg);
        return jsonString;
    }


    public static List<Transportation> getTravelData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Resource resource = new ClassPathResource("json/travel_sensor.json");
            InputStream file = resource.getInputStream();
            List<Transportation> result = mapper.readValue(file,
                    new TypeReference<List<Transportation>>(){}
            );
            return result;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
