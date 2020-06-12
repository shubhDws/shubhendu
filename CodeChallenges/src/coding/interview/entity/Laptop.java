package coding.interview.entity;

public class Laptop /*implements Comparable<Laptop>*/{

	private int cost;
	private String ram;
	private String brand;
	
	public Laptop(int cost, String ram, String brand) {
		this.cost = cost;
		this.ram = ram;
		this.brand = brand;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", ram=" + ram + ", brand=" + brand + "]";
	}

//	@Override
//	public int compareTo(Laptop o) {
//		if(this.getCost() > o.getCost()) return 1; else return -1;
//	}

	
}
