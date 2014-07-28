package sjava.demo;

public  class TangibleAsset implements Things {
	
	private String name;
	private int price;
	private String color;
	private double weight;
	
	public TangibleAsset(String name,int price,String color){
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
}
