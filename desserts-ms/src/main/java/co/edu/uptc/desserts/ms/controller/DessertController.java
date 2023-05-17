package co.edu.uptc.desserts.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.desserts.ms.model.Dessert;
import co.edu.uptc.desserts.ms.model.response.DessertResponse;
import co.edu.uptc.desserts.ms.service.DessertService;

@RequestMapping("/desserts")
@RestController
public class DessertController {
	
	@Autowired
	DessertService dessertService;
	
	@PostMapping("")
	public ResponseEntity<DessertResponse> createDessert(@RequestBody Dessert body) {
		DessertResponse response = new DessertResponse();
		response.addDessert(body);
		
		dessertService.createDessert(body);
		
		return new ResponseEntity<DessertResponse>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("")
	public ResponseEntity<DessertResponse> getAllDesserts() {
		DessertResponse response = new DessertResponse();
		
		response.setData(dessertService.findAllDesserts());
		return new ResponseEntity<>(response ,HttpStatus.OK);
	}
}
