package net.sap.service;

import java.util.List;

import net.sap.dao.Product;
import net.sap.entity.ProductRequest;

public interface ProductRequestService {

	ProductRequest save(Product product) throws Exception;

	List<String> getAllMaterialDescriptions() throws Exception;

	List<String> getAllMaterialCodes() throws Exception;

}
