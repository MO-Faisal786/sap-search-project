package net.sap.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
                    Bklas bklas = new Bklas();
                    bklas.setBklasCode(e);
                    bklasList.add(bklas);
                }
                bklasRepository.saveAll(bklasList);
            }
            if (!dismmSet.isEmpty()) {
                List<Dismm> dismmList = new ArrayList<>();
                for (String e : dismmSet) {
                    Dismm dismm = new Dismm();
                    dismm.setDismmCode(e);
                    dismmList.add(dismm);
                }
                dismmRepository.saveAll(dismmList);
            }
            if (!ekgrpSet.isEmpty()) {
                List<Ekgrp> ekgrpList = new ArrayList<>();
                for (String e : ekgrpSet) {
                    Ekgrp ekgrp = new Ekgrp();
                    ekgrp.setEkgrpCode(e);
                    ekgrpList.add(ekgrp);
                }
                ekgrpRepository.saveAll(ekgrpList);
            }
            if (!matklSet.isEmpty()) {
                List<Matkl> matklList = new ArrayList<>();
                for (String e : matklSet) {
                    Matkl matkl = new Matkl();
                    matkl.setMatklCode(e);
                    matklList.add(matkl);
                }
                matklRepository.saveAll(matklList);
            }
            if (!matnrSet.isEmpty()) {
                List<Matnr> matnrList = new ArrayList<>();
                for (String e : matnrSet) {
                    Matnr matnr = new Matnr();
                    matnr.setMatnrCode(e);
                    matnrList.add(matnr);
                }
                matnrRepository.saveAll(matnrList);
            }
            if (!prctrSet.isEmpty()) {
                List<Prctr> prctrList = new ArrayList<>();
                for (String e : prctrSet) {
                    Prctr prctr = new Prctr();
                    prctr.setPrctrCode(e);
                    prctrList.add(prctr);
                }
                prctrRepository.saveAll(prctrList);
            }

            if (!mbrshSet.isEmpty()) {
                List<Mbrsh> mbrshList = new ArrayList<>();
                for (String e : mbrshSet) {
                    Mbrsh mbrsh = new Mbrsh();
                    mbrsh.setMbrshCode(e);
                    mbrshList.add(mbrsh);
                }
                mbrshRepository.saveAll(mbrshList);
            }
            if (!mtartSet.isEmpty()) {
                List<Mtart> mtartList = new ArrayList<>();
                for (String e : mtartSet) {
                    Mtart mtart = new Mtart();
                    mtart.setMtartCode(e);
                    mtartList.add(mtart);
                }
                mtartRepository.saveAll(mtartList);
            }

            if (!meinsSet.isEmpty()) {
                List<Meins> meinsList = new ArrayList<>();
                for (String e : meinsSet) {
                    Meins meins = new Meins();
                    meins.setMeinsCode(e);
                    meinsList.add(meins);
                }
                meinsRepository.saveAll(meinsList);
            }

            if (!vprsvSet.isEmpty()) {
                List<Vprsv> vprsvList = new ArrayList<>();
                for (String e : vprsvSet) {
                    Vprsv vprsv = new Vprsv();
                    vprsv.setVprsvCode(e);
                    vprsvList.add(vprsv);
                }
                vprsvRepository.saveAll(vprsvList);

            }

            if (!maktxSet.isEmpty()) {
                List<Maktx> mktxList = new ArrayList<>();
                for (String e : maktxSet) {
                    Maktx mktx = new Maktx();
                    mktx.setMaktxCode(e);
                    mktxList.add(mktx);
                }
                maktxRepository.saveAll(mktxList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}