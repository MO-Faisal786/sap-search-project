package net.sap.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaterialSetResponse {
    private D d;

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

    public static class D {
        private List<Material> results;

        public List<Material> getResults() {
            return results;
        }

        public void setResults(List<Material> results) {
            this.results = results;
        }
    }

    public static class Material {
        @JsonProperty("__metadata")
        private Metadata __metadata;
        @JsonProperty("Matnr")
        private String matnr;
        @JsonProperty("Mbrsh")
        private String mbrsh;
        @JsonProperty("Mtart")
        private String mtart;
        @JsonProperty("Meins")
        private String meins;
        @JsonProperty("Maktx")
        private String maktx;
        @JsonProperty("Vprsv")
        private String vprsv;
        @JsonProperty("Bklas")
        private String bklas;
        @JsonProperty("Dismm")
        private String dismm;
        @JsonProperty("Ekgrp")
        private String ekgrp;
        @JsonProperty("Prctr")
        private String prctr;
        @JsonProperty("Matkl")
        private String matkl;

        public Metadata get__metadata() {
            return __metadata;
        }

        public void set__metadata(Metadata __metadata) {
            this.__metadata = __metadata;
        }

        public String getMatnr() {
            return matnr;
        }

        public void setMatnr(String matnr) {
            this.matnr = matnr;
        }

        public String getMbrsh() {
            return mbrsh;
        }

        public void setMbrsh(String mbrsh) {
            this.mbrsh = mbrsh;
        }

        public String getMtart() {
            return mtart;
        }

        public void setMtart(String mtart) {
            this.mtart = mtart;
        }

        public String getMeins() {
            return meins;
        }

        public void setMeins(String meins) {
            this.meins = meins;
        }

        public String getMaktx() {
            return maktx;
        }

        public void setMaktx(String maktx) {
            this.maktx = maktx;
        }

        public String getVprsv() {
            return vprsv;
        }

        public void setVprsv(String vprsv) {
            this.vprsv = vprsv;
        }

        public String getBklas() {
            return bklas;
        }

        public void setBklas(String bklas) {
            this.bklas = bklas;
        }

        public String getDismm() {
            return dismm;
        }

        public void setDismm(String dismm) {
            this.dismm = dismm;
        }

        public String getEkgrp() {
            return ekgrp;
        }

        public void setEkgrp(String ekgrp) {
            this.ekgrp = ekgrp;
        }

        public String getPrctr() {
            return prctr;
        }

        public void setPrctr(String prctr) {
            this.prctr = prctr;
        }

        public String getMatkl() {
            return matkl;
        }

        public void setMatkl(String matkl) {
            this.matkl = matkl;
        }
    }

    public static class Metadata {
        @JsonProperty("id")
        private String id;
        @JsonProperty("uri")
        private String uri;
        @JsonProperty("type")
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
