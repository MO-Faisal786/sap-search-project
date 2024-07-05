package net.sap.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sap.entity.Bklas;
import net.sap.repository.BklasRepository;
import net.sap.service.JsonDataToDatabseService;

@Service
public class JsonDataToDatabseServiceImpl implements JsonDataToDatabseService{

    @Autowired
    private BklasRepository bklasRepository;

    @Override
    public void saveDataFromJsonToDatabase() {
        try {
            String jsonData = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\OneDrive\\Desktop\\JSON.txt")));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Map<String, ArrayList<Map<String, Object>>>> jsonMap = objectMapper.readValue(jsonData, Map.class);
            jsonMap
            .forEach((key, value) -> {
                value.forEach((k, v) -> {
                    for(Map<String, Object> e : v){
                        e.forEach((kk, vv) -> {
                            if(kk.equals("Bklas")){
                                String val = (String) vv;
                                Bklas bklas = new Bklas();
                                bklas.setBklasCode(val);
                                bklasRepository.save(bklas);
                            } else if(kk.equals("Dismm")){
                                
                            }
                        });
                    }
                });
            });
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}