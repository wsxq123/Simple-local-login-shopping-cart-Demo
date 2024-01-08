package model;

public class shoppingCart{
	private String item;
	private String price;
	private String amount;
	public shoppingCart(String item, String price, String amount) {
		super();
		this.item = item;
		this.price = price;
		this.amount = amount;
	}

	public shoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTotal() {
		return  Integer.toString(Integer.parseInt(amount)*Integer.parseInt(price));
	}

	public void setTotal(String total) {
	}
	
	
}
