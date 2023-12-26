package model;

public class member {
	private Integer member_id;
	private String  name;
	private String birthdate;
	private Integer gender;
	private String phone;
	private String  address;

	public member() {
		super();
	}

	public member(String name, String birthdate, Integer gender, String phone, String address) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
