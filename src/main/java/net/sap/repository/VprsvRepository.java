package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Vprsv;

@Repository
public interface VprsvRepository extends JpaRepository<Vprsv, Integer>{
    
}