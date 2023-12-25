package model;

public class member {
	private Integer member_id;
	private String  name;
	private Integer birthdate;
	private Integer gender;
	private Integer phone;
	private String  address;

	public member() {
		super();
	}

	public member(String name, Integer birthdate, Integer gender, Integer phone, String address) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer id) {
		this.member_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Integer birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
