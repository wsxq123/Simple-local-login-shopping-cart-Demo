package model;

public class order {
	private Integer order_id;
	private String order_Number;
	private String order_Date;
	private String order_Time;
	private Integer member_id;
	private Integer seller_id;
	private Integer total;

	public order() {
		super();
	}

	public order(String order_Number, String order_Date, String order_Time, Integer member_id, Integer seller_id,
			Integer total) {
		super();
		this.order_Number = order_Number;
		this.order_Date = order_Date;
		this.order_Time = order_Time;
		this.member_id = member_id;
		this.seller_id = seller_id;
		this.total = total;
	}

	public String getOrder_Number() {
		return order_Number;
	}

	public void setOrder_Number(String order_Number) {
		this.order_Number = order_Number;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}

	public void setOrder_Time(String order_Time) {
		this.order_Time = order_Time;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public void setSeller_id(Integer seller_id) {
		this.seller_id = seller_id;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public String getOrder_Date() {
		return order_Date;
	}

	public String getOrder_Time() {
		return order_Time;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public Integer getSeller_id() {
		return seller_id;
	}

	public Integer getTotal() {
		return total;
	}
}
