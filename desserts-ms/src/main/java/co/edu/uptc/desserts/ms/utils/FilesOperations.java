package co.edu.uptc.desserts.ms.utils;

import java.util.List;

import co.edu.uptc.desserts.ms.model.Dessert;

public interface FilesOperations {
	void writeDessert(String path, Dessert dessert);
	List<Dessert> readDesserts(String path);
}
