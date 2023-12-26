package model;

public class order_product {
	private String 	order_number;
	private Integer product_id;
	private Integer amount;
	private Integer cost;
	
	public order_product() {
		super();
	}

	public order_product(String order_number, Integer product_id, Integer amount, Integer cost) {
		super();
		this.order_number = order_number;
		this.product_id = product_id;
		this.amount = amount;
		this.cost = cost;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setorder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getorder_number() {
		return order_number;
	}

	public Integer getProduct_id() {
		return product_id;
	}
	
	
	
}
