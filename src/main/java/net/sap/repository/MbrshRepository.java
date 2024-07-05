package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Mbrsh;

@Repository
public interface MbrshRepository extends JpaRepository<Mbrsh, Integer>{
    
}