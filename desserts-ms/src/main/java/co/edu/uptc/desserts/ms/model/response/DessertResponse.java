package co.edu.uptc.desserts.ms.model.response;

import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.desserts.ms.model.Dessert;

public class DessertResponse {
	private List<Dessert> data;
	
	public DessertResponse() {
		data = new ArrayList<>();
	}

	public List<Dessert> getData() {
		return data;
	}

	public void setData(List<Dessert> data) {
		this.data = data;
	}
	
	public void addDessert(Dessert dessert) {
		data.add(dessert);
	}
	
}
