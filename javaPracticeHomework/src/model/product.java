package model;

public class product {
	private String product_id;
	private String product_name;
	private Integer product_price;
	
	public product() {
		super();
	}

	public product( String product_name, Integer product_price) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	public String getProduct_id() {
		return product_id;
	}
	
	
}
