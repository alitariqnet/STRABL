package bean;

public class CustomerBean {

	private long Id;
	private String name;
	private String phone;
	private String address;
	
	public CustomerBean(long id, String name, String phone, String address) {
		this.Id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
