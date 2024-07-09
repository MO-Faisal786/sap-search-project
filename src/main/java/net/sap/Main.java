package net.sap;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sap.dao.MaterialSetResponse;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Set<String> matnrSet = new LinkedHashSet<>();
        Set<String> mbrshSet = new LinkedHashSet<>();
        Set<String> mtartSet = new LinkedHashSet<>();
        Set<String> meinsSet = new LinkedHashSet<>();
        Set<String> maktxSet = new LinkedHashSet<>();
        Set<String> vprsvSet = new LinkedHashSet<>();
        Set<String> bklasSet = new LinkedHashSet<>();
        Set<String> dismmSet = new LinkedHashSet<>();
        Set<String> ekgrpSet = new LinkedHashSet<>();
        Set<String> prctrSet = new LinkedHashSet<>();
        Set<String> matklSet = new LinkedHashSet<>();
        try {
            MaterialSetResponse response = objectMapper.readValue(
                    new File("D:/InternshipWork/sap-search/src/main/java/net/sap/Json/JSON.json"),
                    MaterialSetResponse.class);

            List<MaterialSetResponse.Material> uniqueResults = response.getD().getResults().stream()
                    .filter(material -> matnrSet.add(material.getMatnr()))
                    .filter(material -> mbrshSet.add(material.getMbrsh()))
                    .filter(material -> mtartSet.add(material.getMtart()))
                    .filter(material -> meinsSet.add(material.getMeins()))
                    .filter(material -> maktxSet.add(material.getMaktx()))
                    .filter(material -> vprsvSet.add(material.getVprsv()))
                    .filter(material -> bklasSet.add(material.getBklas()))
                    .filter(material -> dismmSet.add(material.getDismm()))
                    .filter(material -> ekgrpSet.add(material.getEkgrp()))
                    .filter(material -> prctrSet.add(material.getPrctr()))
                    .filter(material -> matklSet.add(material.getMatkl()))
                    .collect(Collectors.toList());

            // response.getD().getResults().stream()
            // .map(material -> matnrSet.forEach(e -> material.setMatnr(e)));
            
            // Write the modified object back to a JSON file
            // objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            // objectMapper.writeValue(new File("D:/InternshipWork/sap-search/src/main/java/net/sap/Json/Filtered_JSON.json"), response);

            // System.out.println("Duplicates removed and JSON file updated successfully.");

            System.out.println(ekgrpSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}