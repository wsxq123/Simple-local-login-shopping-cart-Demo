package model;

public class order {
	private Integer sellerID;
	private String  password;
	private Integer name;
	
	public order(Integer sellerID, String password, Integer name) {
		super();
		this.sellerID = sellerID;
		this.password = password;
		this.name = name;
	}

	public Integer getSellerID() {
		return sellerID;
	}

	public void setSellerID(Integer sellerID) {
		this.sellerID = sellerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}
	
	
}
