package model;

public class order_product {
	private String 	order_Number;
	private String product_id;
	private Integer amount;
	private Integer cost;
	
	public order_product() {
		super();
	}

	public order_product(String order_Number, String product_id, Integer amount, Integer cost) {
		super();
		this.order_Number = order_Number;
		this.product_id = product_id;
		this.amount = amount;
		this.cost = cost;
	}

	public String getOrder_Number() {
		return order_Number;
	}

	public void setOrder_Number(String order_Number) {
		this.order_Number = order_Number;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
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

	
	
}
