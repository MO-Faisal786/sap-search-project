package net.sap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sap.dao.MaterialSetResponse;

public class Main {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/api/data";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            ObjectMapper objectMapper = new ObjectMapper();
            MaterialSetResponse jsonResponse = objectMapper.readValue(response.getBody(), MaterialSetResponse.class);

            System.out.println(jsonResponse.getD().getResults().get(0).getBklas());
        }
    }
}