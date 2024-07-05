package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sap.entity.Matkl;

@Repository
public interface MatklRepository extends JpaRepository<Matkl, Integer> {
    
}