package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Meins;

@Repository
public interface MeinsRepository extends JpaRepository<Meins, Integer>{
    
}