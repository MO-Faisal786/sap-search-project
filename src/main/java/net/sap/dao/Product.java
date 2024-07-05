package net.sap.dao;

import java.util.UUID;

public class Product {
	private String MTART; // Material Type
	private String MBRSH; // Industry
	private String MATNR; // Material Code
	private String MAKTX; // Material Description
	private String MEINS; // Unit of Measure
	private String VPRSV; // Price Control V/S
	private String BKLAS; // Valuation Class
	private String PEINH; // Price
	private String DISMM; // MRP Type
	private String EKGRP; // Purchasing Group
	private String PRCTR; // Profit Center
	private String MATKL; // Material Group
	private String status;
	private String msg;
	private String requestUUID;

	public String getMTART() {
		return MTART;
	}

	public void setMTART(String MTART) {
		this.MTART = MTART;
	}

	public String getMBRSH() {
		return MBRSH;
	}

	public void setMBRSH(String MBRSH) {
		this.MBRSH = MBRSH;
	}

	public String getMATNR() {
		return MATNR;
	}

	public void setMATNR(String MATNR) {
		this.MATNR = MATNR;
	}

	public String getMAKTX() {
		return MAKTX;
	}

	public void setMAKTX(String MAKTX) {
		this.MAKTX = MAKTX;
	}

	public String getMEINS() {
		return MEINS;
	}

	public void setMEINS(String MEINS) {
		this.MEINS = MEINS;
	}

	public String getVPRSV() {
		return VPRSV;
	}

	public void setVPRSV(String VPRSV) {
		this.VPRSV = VPRSV;
	}

	public String getBKLAS() {
		return BKLAS;
	}

	public void setBKLAS(String BKLAS) {
		this.BKLAS = BKLAS;
	}

	public String getPEINH() {
		return PEINH;
	}

	public void setPEINH(String PEINH) {
		this.PEINH = PEINH;
	}

	public String getDISMM() {
		return DISMM;
	}

	public void setDISMM(String DISMM) {
		this.DISMM = DISMM;
	}

	public String getEKGRP() {
		return EKGRP;
	}

	public void setEKGRP(String EKGRP) {
		this.EKGRP = EKGRP;
	}

	public String getPRCTR() {
		return PRCTR;
	}

	public void setPRCTR(String PRCTR) {
		this.PRCTR = PRCTR;
	}

	public String getMATKL() {
		return MATKL;
	}

	public void setMATKL(String MATKL) {
		this.MATKL = MATKL;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRequestUUID() {
		return UUID.randomUUID().toString();
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}
	
}
