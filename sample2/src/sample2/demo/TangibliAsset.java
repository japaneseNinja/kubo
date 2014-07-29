package sample2.demo;

public abstract class TangibliAsset extends Asset implements Things2  {
	
	private String color;
	private double weight;
	
	public TangibliAsset(String name,int price,String color){
		super(name,price);

		this.color = color;
	}
	
	public String getColor(){return this.color;}
	public double getWeight(){return this.weight;}
	public void setWeight(double weight){this.weight = weight;}

}
