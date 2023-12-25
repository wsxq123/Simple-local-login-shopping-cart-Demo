package model;

public class order_product {
	private Integer order_id;
	private Integer product_id;
	private Integer amount;
	private Integer cost;
	
	public order_product() {
		super();
	}

	public order_product(Integer order_id, Integer product_id, Integer amount, Integer cost) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.amount = amount;
		this.cost = cost;
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

	public Integer getOrder_id() {
		return order_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}
	
	
	
}
