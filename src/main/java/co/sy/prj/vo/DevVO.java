package co.sy.prj.vo;

public class DevVO {		// VO(Value Object)객체 , DTO(Data Transfer Object)객체
	private int id;
	private String name;
	private String address;
	private int age;
	
	public DevVO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		System.out.print("I  D : " + id + " | ");
		System.out.print("Name : " + name + " | ");
		System.out.print("Addr : " + address + " | ");
		System.out.println("Age  : " + age + " | ");
		return null;
	}
}
