package org.thingsboard.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sender<T> {

    public static ObjectMapper mapper = new ObjectMapper();
    public Map<String, List<T>> listOfMsg;

    public Map<String, List<T>> getListOfMsg() {
        return listOfMsg;
    }

    public void setListOfMsg(Map<String, List<T>> listOfMsg) {
        this.listOfMsg = listOfMsg;
    }

    public Sender(Map<String, List<T>> listOfMsg) {
        this.listOfMsg = listOfMsg;
    }
}
