package model;

public class order {
	private Integer order_id;
	private Integer order_Date;
	private Integer order_Time;
	private Integer member_id;
	private Integer seller_id;
	private Integer total;
	
	public order() {
		super();
	}
	
	public order(Integer order_id, Integer order_Date, Integer order_Time, Integer member_id, Integer seller_id,
			Integer total) {
		super();
		this.order_id = order_id;
		this.order_Date = order_Date;
		this.order_Time = order_Time;
		this.member_id = member_id;
		this.seller_id = seller_id;
		this.total = total;
	}
	
	public Integer getOrder_id() {
		return order_id;
	}
	public Integer getOrder_Date() {
		return order_Date;
	}
	public Integer getOrder_Time() {
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
