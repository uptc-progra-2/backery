package co.edu.uptc.desserts.ms.service;

import java.util.List;

import co.edu.uptc.desserts.ms.model.Dessert;

public interface DessertService {
	void createDessert(Dessert dessert);
	
	List<Dessert> findAllDesserts();
}
