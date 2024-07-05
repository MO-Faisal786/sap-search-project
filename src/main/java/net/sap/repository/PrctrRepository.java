package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Prctr;

@Repository
public interface PrctrRepository extends JpaRepository<Prctr, Integer>{
    
}