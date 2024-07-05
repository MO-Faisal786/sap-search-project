package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Ekgrp;

@Repository
public interface EkgrpRepository extends JpaRepository<Ekgrp, Integer> {
    
}