package net.sap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.sap.entity.ProductRequest;

@Repository
public interface ProductRequestRepository extends JpaRepository<ProductRequest, Long> {

	@Query("SELECT p.MAKTX FROM ProductRequest p")
	List<String> findAllMAKTX();

	@Query("SELECT p.MATNR FROM ProductRequest p")
	List<String> findAllMATNR();
	// fetching data for mtart
	// @Query("SELECT MTART.mtartvalue FROM Mtart MTART")
	// List<String> findAllMtartvalue();

	// // fetching data for mbrsh
	// @Query("SELECT MBRSH.mbrshvalue FROM Mbrsh MBRSH")
	// List<String> findAllMbrshvalue();

	// // fetching data for meins
	// @Query("SELECT MEINS.meinsvalue FROM Meins MEINS")
	// List<String> findAllMeinsvalue();

	// // fetching data for vprsv
	// @Query("SELECT VPRSV.vprsvvalue FROM Vprsv VPRSV")
	// List<String> findAllVprsvvalue();

	// // fetching data for bklas
	// @Query("SELECT BKLAS.bklasvalue FROM Bklas BKLAS")
	// List<String> findAllBklasvalue();

	// // fetching data for dismm
	// @Query("SELECT DISMM.dismmvalue FROM Dismm DISMM")
	// List<String> findAllDismmvalue();

	// // fetching data for ekgrp
	// @Query("SELECT EKGRP.ekgrpvalue FROM Ekgrp EKGRP")
	// List<String> findAllEkgrpvalue();

	// // fetching data for prctr
	// @Query("SELECT PRCTR.prctrvalue FROM Prctr PRCTR")
	// List<String> findAllPrctrvalue();
}
