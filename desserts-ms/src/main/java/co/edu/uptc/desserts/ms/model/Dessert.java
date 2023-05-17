package co.edu.uptc.desserts.ms.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dessert implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5896711092520088098L;

	@JsonProperty("product_id")
	private long id;
	
	@JsonProperty("product_name")
	private String name;
	
	@JsonProperty("product_amount")
	private double amount;
	
	@JsonProperty("product_recipe")
	private String recipe;
	
	public Dessert() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
}
