package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Dismm;

@Repository
public interface DismmRepository extends JpaRepository<Dismm, Integer>{
    
}