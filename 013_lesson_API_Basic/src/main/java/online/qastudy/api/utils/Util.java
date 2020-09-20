package online.qastudy.api.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
    private static ObjectMapper mapper = new ObjectMapper();


    public static String pojoToJson(Class<? extends Object> pojo) {
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(pojo);
        } catch (JsonProcessingException e) {
            Log.LOG.error(e);
        }
        return jsonResult;
    }
}
