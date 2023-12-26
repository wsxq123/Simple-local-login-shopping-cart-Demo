package model;

public class seller {
	private Integer seller_id;
	private String seller_name;
	private String password;
	private String seller_brithdate;
	
	public seller() {
		super();
	}

	public seller(Integer seller_id, String seller_name, String password, String seller_brithdate) {
		super();
		this.seller_id = seller_id;
		this.seller_name = seller_name;
		this.password = password;
		this.seller_brithdate = seller_brithdate;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSeller_id() {
		return seller_id;
	}

	public String getSeller_brithdate() {
		return seller_brithdate;
	}

	public void setSeller_brithdate(String seller_brithdate) {
		this.seller_brithdate = seller_brithdate;
	}

	public void setSeller_id(Integer seller_id) {
		this.seller_id = seller_id;
	}
	
	
}
