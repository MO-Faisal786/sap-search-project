package net.sap.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/api/data";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            MaterialSetResponse jsonResponse = objectMapper.readValue(response.getBody(), MaterialSetResponse.class);

            List<Material> materials = jsonResponse.getD().getResults();

            saveEntities(matnrRepository, materials, Material::getMatnr, Matnr::new, Matnr::setMatnrCode);
            saveEntities(mbrshRepository, materials, Material::getMbrsh, Mbrsh::new, Mbrsh::setMbrshCode);
            saveEntities(mtartRepository, materials, Material::getMtart, Mtart::new, Mtart::setMtartCode);
            saveEntities(meinsRepository, materials, Material::getMeins, Meins::new, Meins::setMeinsCode);
            saveEntities(maktxRepository, materials, Material::getMaktx, Maktx::new, Maktx::setMaktxCode);
            saveEntities(vprsvRepository, materials, Material::getVprsv, Vprsv::new, Vprsv::setVprsvCode);
            saveEntities(bklasRepository, materials, Material::getBklas, Bklas::new, Bklas::setBklasCode);
            saveEntities(dismmRepository, materials, Material::getDismm, Dismm::new, Dismm::setDismmCode);
            saveEntities(ekgrpRepository, materials, Material::getEkgrp, Ekgrp::new, Ekgrp::setEkgrpCode);
            saveEntities(prctrRepository, materials, Material::getPrctr, Prctr::new, Prctr::setPrctrCode);
            saveEntities(matklRepository, materials, Material::getMatkl, Matkl::new, Matkl::setMatklCode);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T, R extends CharSequence, E> void saveEntities(JpaRepository<E, ?> repository, List<T> materials,
            Function<T, R> getCode, Supplier<E> createEntity,
            BiConsumer<E, R> setCode) {
        Set<R> codes = materials.stream()
                .map(getCode)
                .filter(code -> code != null && !code.isEmpty())
                .collect(Collectors.toSet());

        if (!codes.isEmpty()) {
            List<E> entities = codes.stream()
                    .map(code -> {
                        E entity = createEntity.get();
                        setCode.accept(entity, code);
                        return entity;
                    })
                    .collect(Collectors.toList());

            List<E> existingEntities = StreamSupport.stream(repository.findAll().spliterator(), false)
                    .collect(Collectors.toList());

            List<E> newEntities = entities.stream()
                    .filter(entity -> !existingEntities.contains(entity))
                    .collect(Collectors.toList());

            repository.saveAll(newEntities);
        }
    }
}
