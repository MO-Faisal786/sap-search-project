package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Bklas;

@Repository
public interface BklasRepository extends JpaRepository<Bklas, Integer>{
    
}