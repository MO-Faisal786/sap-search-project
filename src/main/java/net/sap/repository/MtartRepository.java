package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Mtart;

@Repository
public interface MtartRepository extends JpaRepository<Mtart, Integer>{
    
}