package net.sap;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sap.dao.MaterialSetResponse;
import net.sap.dao.MaterialSetResponse.Material;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Set<String> matnr = new LinkedHashSet<>();
        Set<String> mbrsh = new LinkedHashSet<>();
        Set<String> mtart = new LinkedHashSet<>();
        Set<String> meins = new LinkedHashSet<>();
        Set<String> maktx = new LinkedHashSet<>();
        Set<String> vprsv = new LinkedHashSet<>();
        Set<String> bklas = new LinkedHashSet<>();
        Set<String> dismm = new LinkedHashSet<>();
        Set<String> ekgrp = new LinkedHashSet<>();
        Set<String> prctr = new LinkedHashSet<>();
        Set<String> matkl = new LinkedHashSet<>();
        try {
            MaterialSetResponse response = objectMapper.readValue(new File("D:/InternshipWork/sap-search/src/main/java/net/sap/Json/JSON.json"), MaterialSetResponse.class);
            
            for(Material e : response.getD().getResults()){
                matnr.add(e.getMatnr());
                mbrsh.add(e.getMbrsh());
                mtart.add(e.getMtart());
                meins.add(e.getMeins());
                maktx.add(e.getMaktx());
                vprsv.add(e.getVprsv());
                bklas.add(e.getBklas());
                dismm.add(e.getDismm());
                ekgrp.add(e.getEkgrp());
                prctr.add(e.getPrctr());
                matkl.add(e.getMatkl());
            }
            System.out.println(mbrsh);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}