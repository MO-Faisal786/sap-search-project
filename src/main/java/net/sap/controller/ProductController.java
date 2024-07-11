package net.sap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.sap.dao.Product;
import net.sap.entity.ProductRequest;
import net.sap.service.JsonDataToDatabseService;
import net.sap.service.ProductRequestService;

@Controller
public class ProductController {
	@Autowired
	private ProductRequestService productRequestService;

	@Autowired
	private JsonDataToDatabseService jsonDataToDatabseService;

	@GetMapping("/productSearch")
	public String showSearchForm(Model model) {
		final Product product = new Product();
		model.addAttribute("product", product);
		List<String> materialDescriptions;

		List<String> materialcodes;

		try {
			materialDescriptions = productRequestService.getAllMaterialDescriptions();
			model.addAttribute("materialDescriptions", materialDescriptions);

			materialcodes = productRequestService.getAllMaterialCodes();
			model.addAttribute("materialcodes", materialcodes);

			jsonDataToDatabseService.saveDataFromJsonToDatabase();
			

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return "product_search";
	}

	@PostMapping("/productSearch")
	public String productSearch(Model model, @ModelAttribute("product") Product product) {
		System.out.println(product);
		model.addAttribute("product", product);
		/************ GET Call ******************/
		/*
		 * try { String apiUrl = "https://dummy.restapiexample.com/api/v1/employee/1";
		 * RestTemplate restTemplate = new RestTemplate(); HttpHeaders headers = new
		 * HttpHeaders(); headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity = new HttpEntity<String>(headers); String result =
		 * restTemplate.exchange(apiUrl, HttpMethod.GET, entity,
		 * String.class).getBody(); System.out.println(result); } catch
		 * (HttpClientErrorException.MethodNotAllowed e) {
		 * System.out.println("Method not allowed: " + e.getMessage()); }
		 */
		/**********************************/

		/************ POST Call ******************/
//		try {
//			JSONObject personJsonObject = new JSONObject();
//			personJsonObject.put("name", "Sarvesh Awasthi");
//			personJsonObject.put("salary", "123");
//			personJsonObject.put("age", "23");
//			String createPersonUrl = "https://dummy.restapiexample.com/api/v1/create";
//			RestTemplate restTemplate = new RestTemplate();
//			HttpHeaders headers = new HttpHeaders();
//			headers.setContentType(MediaType.APPLICATION_JSON);
//
//			HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);
//
//			ResponseEntity<String> responseEntityStr = restTemplate.postForEntity(createPersonUrl, request,
//					String.class);
//			System.out.println("responseEntityStr");
//			System.out.println(responseEntityStr.getBody());
//		} catch (HttpClientErrorException.MethodNotAllowed e) {
//			System.out.println("Method not allowed: " + e.getMessage());
//		}

		/*****************************************/

//		System.out.println(restTemplate.getForObject(apiUrl, String.class).toString());

		try {

			final ProductRequest productRequest = productRequestService.save(product);
			if (productRequest.getRequestUUID() != null) {
				product.setStatus("success");
				product.setMsg(
						"Product Request Successfully Submitted With Request Id: " + productRequest.getRequestUUID());
			} else {
				product.setStatus("fail");
				product.setMsg("Product Request Failed");
			}
			model.addAttribute("product", product);
			// final List<String> materialDescriptions = productRequestService.getAllMaterialDescriptions();
			// model.addAttribute("materialDescriptions", materialDescriptions);

			// final List<String> materialcodes = productRequestService.getAllMaterialCodes();
			// model.addAttribute("materialcodes", materialcodes);
			return "product_search";
		} catch (final Exception e) {
			product.setStatus("fail");
			product.setMsg("Product Request Failed");
			model.addAttribute("product", product);
			return "product_search";
		}
	}

}
