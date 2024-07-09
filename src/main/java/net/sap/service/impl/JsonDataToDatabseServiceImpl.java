package net.sap.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sap.dao.MaterialSetResponse;
import net.sap.dao.MaterialSetResponse.Material;
import net.sap.entity.Bklas;
import net.sap.entity.Dismm;
import net.sap.entity.Ekgrp;
import net.sap.entity.Maktx;
import net.sap.entity.Matkl;
import net.sap.entity.Matnr;
import net.sap.entity.Mbrsh;
import net.sap.entity.Meins;
import net.sap.entity.Mtart;
import net.sap.entity.Prctr;
import net.sap.entity.Vprsv;
import net.sap.repository.BklasRepository;
import net.sap.repository.DismmRepository;
import net.sap.repository.EkgrpRepository;
import net.sap.repository.MaktxRepository;
import net.sap.repository.MatklRepository;
import net.sap.repository.MatnrRepository;
import net.sap.repository.MbrshRepository;
import net.sap.repository.MeinsRepository;
import net.sap.repository.MtartRepository;
import net.sap.repository.PrctrRepository;
import net.sap.repository.VprsvRepository;
import net.sap.service.JsonDataToDatabseService;

@Service
public class JsonDataToDatabseServiceImpl implements JsonDataToDatabseService {

    @Autowired
    private MatnrRepository matnrRepository;

    @Autowired
    private MbrshRepository mbrshRepository;

    @Autowired
    private MtartRepository mtartRepository;

    @Autowired
    private MeinsRepository meinsRepository;

    @Autowired
    private MaktxRepository maktxRepository;

    @Autowired
    private VprsvRepository vprsvRepository;

    @Autowired
    private BklasRepository bklasRepository;

    @Autowired
    private DismmRepository dismmRepository;

    @Autowired
    private EkgrpRepository ekgrpRepository;

    @Autowired
    private PrctrRepository prctrRepository;

    @Autowired
    private MatklRepository matklRepository;

    @Override
    public void saveDataFromJsonToDatabase() {
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

            for (Material e : response.getD().getResults()) {
                matnrSet.add(e.getMatnr());
                mbrshSet.add(e.getMbrsh());
                mtartSet.add(e.getMtart());
                meinsSet.add(e.getMeins());
                maktxSet.add(e.getMaktx());
                vprsvSet.add(e.getVprsv());
                bklasSet.add(e.getBklas());
                dismmSet.add(e.getDismm());
                ekgrpSet.add(e.getEkgrp());
                prctrSet.add(e.getPrctr());
                matklSet.add(e.getMatkl());
            }
            if (!bklasSet.isEmpty()) {
                List<Bklas> bklasList = new ArrayList<>();
                for (String e : bklasSet) {
                    if (!e.equals("")) {
                        Bklas bklas = new Bklas();
                        bklas.setBklasCode(e);
                        bklasList.add(bklas);
                    }
                }
                List<Bklas> bklasAll = bklasRepository.findAll();
                List<Bklas> differentElements = bklasList.stream().filter(e -> !bklasAll
                .contains(e)).collect(Collectors.toList());
                bklasRepository.saveAll(differentElements);
            }
            if (!dismmSet.isEmpty()) {
                List<Dismm> dismmList = new ArrayList<>();
                for (String e : dismmSet) {
                    if (!e.equals("")) {
                        Dismm dismm = new Dismm();
                        dismm.setDismmCode(e);
                        dismmList.add(dismm);
                    }
                }
                List<Dismm> dismmAll = dismmRepository.findAll();
                List<Dismm> differentElements = dismmList.stream().filter(e -> !dismmAll
                .contains(e)).collect(Collectors.toList());
                dismmRepository.saveAll(differentElements);
            }
            if (!ekgrpSet.isEmpty()) {
                List<Ekgrp> ekgrpList = new ArrayList<>();
                for (String e : ekgrpSet) {
                    if (!e.equals("")) {
                        if (!e.equals("")) {
                            Ekgrp ekgrp = new Ekgrp();
                            ekgrp.setEkgrpCode(e);
                            ekgrpList.add(ekgrp);
                        }
                    }
                }
                List<Ekgrp> ekgrpAll = ekgrpRepository.findAll();
                List<Ekgrp> differentElements = ekgrpList.stream().filter(e -> !ekgrpAll
                        .contains(e)).collect(Collectors.toList());
                ekgrpRepository.saveAll(differentElements);
            }
            if (!matklSet.isEmpty()) {
                List<Matkl> matklList = new ArrayList<>();
                for (String e : matklSet) {
                    if (!e.equals("")) {
                        Matkl matkl = new Matkl();
                        matkl.setMatklCode(e);
                        matklList.add(matkl);
                    }
                }
                List<Matkl> matklAll = matklRepository.findAll();
                List<Matkl> differentElements = matklList.stream().filter(e -> !matklAll
                        .contains(e)).collect(Collectors.toList());
                matklRepository.saveAll(differentElements);
            }
            if (!matnrSet.isEmpty()) {
                List<Matnr> matnrList = new ArrayList<>();
                for (String e : matnrSet) {
                    if (!e.equals("")) {
                        Matnr matnr = new Matnr();
                        matnr.setMatnrCode(e);
                        matnrList.add(matnr);
                    }
                }
                List<Matnr> matnrAll = matnrRepository.findAll();
                List<Matnr> differentElements = matnrList.stream().filter(e -> !matnrAll
                        .contains(e)).collect(Collectors.toList());
                matnrRepository.saveAll(differentElements);
            }
            if (!prctrSet.isEmpty()) {
                List<Prctr> prctrList = new ArrayList<>();
                for (String e : prctrSet) {
                    if (!e.equals("")) {
                        Prctr prctr = new Prctr();
                        prctr.setPrctrCode(e);
                        prctrList.add(prctr);
                    }
                }
                List<Prctr> prctrAll = prctrRepository.findAll();
                List<Prctr> differentElements = prctrList.stream().filter(e -> !prctrAll
                        .contains(e)).collect(Collectors.toList());
                prctrRepository.saveAll(differentElements);
            }

            if (!mbrshSet.isEmpty()) {
                List<Mbrsh> mbrshList = new ArrayList<>();
                for (String e : mbrshSet) {
                    if (!e.equals("")) {
                        Mbrsh mbrsh = new Mbrsh();
                        mbrsh.setMbrshCode(e);
                        mbrshList.add(mbrsh);
                    }
                }
                List<Mbrsh> mbrshAll = mbrshRepository.findAll();
                List<Mbrsh> differentElements = mbrshList.stream().filter(e -> !mbrshAll
                        .contains(e)).collect(Collectors.toList());
                mbrshRepository.saveAll(differentElements);

            }
            if (!mtartSet.isEmpty()) {
                List<Mtart> mtartList = new ArrayList<>();
                for (String e : mtartSet) {
                    if (!e.equals("")) {
                        Mtart mtart = new Mtart();
                        mtart.setMtartCode(e);
                        mtartList.add(mtart);
                    }
                }

                List<Mtart> mtartAll = mtartRepository.findAll();
                List<Mtart> differentElements = mtartList.stream().filter(e -> !mtartAll
                        .contains(e)).collect(Collectors.toList());
                mtartRepository.saveAll(differentElements);
            }

            if (!meinsSet.isEmpty()) {
                List<Meins> meinsList = new ArrayList<>();
                for (String e : meinsSet) {
                    if (!e.equals("")) {
                        Meins meins = new Meins();
                        meins.setMeinsCode(e);
                        meinsList.add(meins);
                    }
                }
                List<Meins> meinsAll = meinsRepository.findAll();
                List<Meins> differentElements = meinsList.stream().filter(e -> !meinsAll
                        .contains(e)).collect(Collectors.toList());
                meinsRepository.saveAll(differentElements);
            }

            if (!vprsvSet.isEmpty()) {
                List<Vprsv> vprsvList = new ArrayList<>();
                for (String e : vprsvSet) {
                    if (!e.equals("")) {
                        Vprsv vprsv = new Vprsv();
                        vprsv.setVprsvCode(e);
                        vprsvList.add(vprsv);
                    }
                }
                List<Vprsv> vprsvAll = vprsvRepository.findAll();
                List<Vprsv> differentElements = vprsvList.stream().filter(e -> !vprsvAll
                        .contains(e)).collect(Collectors.toList());
                vprsvRepository.saveAll(differentElements);

            }

            if (!maktxSet.isEmpty()) {
                List<Maktx> mktxList = new ArrayList<>();
                for (String e : maktxSet) {
                    if (!e.equals("")) {
                        Maktx mktx = new Maktx();
                        mktx.setMaktxCode(e);
                        mktxList.add(mktx);
                    }
                }
                List<Maktx> maktxAll = maktxRepository.findAll();
                List<Maktx> differentElements = mktxList.stream().filter(e -> !maktxAll
                        .contains(e)).collect(Collectors.toList());
                maktxRepository.saveAll(differentElements);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}