package test;

public class Shop {
	private String name;
	private int phone, tv, computer, sum;
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPhone (int phone) {
		this.phone = phone;
	}
	public int getPhone() {
		return this.phone;
	}
	public void setTv (int tv) {
		this.tv = tv;
	}
	public int getTv () {
		return this.tv;
	}
	public void setComputer (int computer) {
		this.computer = computer;
	}
	public int getComputer() {
		return this.computer;
	}
	public void sum () {
		this.sum=this.phone + this.tv + this.computer;
	}
	public void printStates() {
		System.out.println(name+"님 총 결제 하실 금액은"+sum+"원 입니다");
	}

}
