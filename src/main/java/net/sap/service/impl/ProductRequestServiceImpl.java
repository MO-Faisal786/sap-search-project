package net.sap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sap.dao.Product;
import net.sap.entity.ProductRequest;
import net.sap.repository.ProductRequestRepository;
import net.sap.service.ProductRequestService;

@Service
public class ProductRequestServiceImpl implements ProductRequestService {
	@Autowired
	ProductRequestRepository productRequestRepository;

	@Override
	public ProductRequest save(Product product) throws Exception {
		final ProductRequest productObj = new ProductRequest(product);
		return productRequestRepository.save(productObj);
	}

	@Override
	public List<String> getAllMaterialDescriptions() throws Exception {
		return productRequestRepository.findAllMAKTX();
	}

	@Override
	public List<String> getAllMaterialCodes() throws Exception {
		return productRequestRepository.findAllMATNR();
	}
}
