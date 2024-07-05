package net.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sap.entity.Matnr;

public interface MatnrRepository extends JpaRepository<Matnr, Integer> {

}
