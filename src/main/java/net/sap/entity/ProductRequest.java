package net.sap.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import net.sap.dao.Product;

@Entity
public class ProductRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String MTART;

	@Column
	private String MBRSH;

	@Column
	private String MATNR;

	@Column
	private String MAKTX;

	@Column
	private String MEINS;

	@Column
	private String VPRSV;

	@Column
	private String BKLAS;

	@Column
	private String PEINH;

	@Column
	private String DISMM;

	@Column
	private String EKGRP;

	@Column
	private String PRCTR;

	@Column
	private String MATKL;

	@Column
	private String requestUUID;

	@Column
	private Date createdOn;

	public ProductRequest(Product product) {
		MTART = product.getMTART();
		MBRSH = product.getMBRSH();
		MATNR = product.getMATNR();
		MAKTX = product.getMAKTX();
		MEINS = product.getMEINS();
		VPRSV = product.getVPRSV();
		BKLAS = product.getBKLAS();
		PEINH = product.getPEINH();
		DISMM = product.getDISMM();
		EKGRP = product.getEKGRP();
		PRCTR = product.getPRCTR();
		MATKL = product.getMATKL();
		requestUUID = String.valueOf(System.currentTimeMillis());
		createdOn = new Date();

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMTART() {
		return MTART;
	}

	public void setMTART(String mTART) {
		MTART = mTART;
	}

	public String getMBRSH() {
		return MBRSH;
	}

	public void setMBRSH(String mBRSH) {
		MBRSH = mBRSH;
	}

	public String getMATNR() {
		return MATNR;
	}

	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}

	public String getMAKTX() {
		return MAKTX;
	}

	public void setMAKTX(String mAKTX) {
		MAKTX = mAKTX;
	}

	public String getMEINS() {
		return MEINS;
	}

	public void setMEINS(String mEINS) {
		MEINS = mEINS;
	}

	public String getVPRSV() {
		return VPRSV;
	}

	public void setVPRSV(String vPRSV) {
		VPRSV = vPRSV;
	}

	public String getBKLAS() {
		return BKLAS;
	}

	public void setBKLAS(String bKLAS) {
		BKLAS = bKLAS;
	}

	public String getPEINH() {
		return PEINH;
	}

	public void setPEINH(String pEINH) {
		PEINH = pEINH;
	}

	public String getDISMM() {
		return DISMM;
	}

	public void setDISMM(String dISMM) {
		DISMM = dISMM;
	}

	public String getEKGRP() {
		return EKGRP;
	}

	public void setEKGRP(String eKGRP) {
		EKGRP = eKGRP;
	}

	public String getPRCTR() {
		return PRCTR;
	}

	public void setPRCTR(String pRCTR) {
		PRCTR = pRCTR;
	}

	public String getMATKL() {
		return MATKL;
	}

	public void setMATKL(String mATKL) {
		MATKL = mATKL;
	}

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
