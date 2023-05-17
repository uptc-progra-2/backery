package co.edu.uptc.model;

public class Desserts {
	private long product_id;
	private String product_name;
	private double product_amount;
	private String product_recipe;

	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(double product_amount) {
		this.product_amount = product_amount;
	}
	public String getProduct_recipe() {
		return product_recipe;
	}
	public void setProduct_recipe(String product_recipe) {
		this.product_recipe = product_recipe;
	}
	@Override
	public String toString() {
		return "Desserts [product_id=" + product_id + ", product_name=" + product_name + ", product_amount="
				+ product_amount + ", product_recipe=" + product_recipe + "]";
	}
}
