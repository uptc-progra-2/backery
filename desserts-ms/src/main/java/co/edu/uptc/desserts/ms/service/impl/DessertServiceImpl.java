package co.edu.uptc.desserts.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uptc.desserts.ms.model.Dessert;
import co.edu.uptc.desserts.ms.service.DessertService;
import co.edu.uptc.desserts.ms.utils.FilesOperations;
import co.edu.uptc.desserts.ms.utils.impl.Constants;

@Service
public class DessertServiceImpl implements DessertService {
	@Autowired
	FilesOperations filesOperations;
	
	@Override
	public void createDessert(Dessert dessert) {
		filesOperations.writeDessert(Constants.DB_PATH, dessert);
	}

	@Override
	public List<Dessert> findAllDesserts() {
		// TODO Auto-generated method stub
		return filesOperations.readDesserts(Constants.DB_PATH);
	}

}
