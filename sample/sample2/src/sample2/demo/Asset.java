package sample2.demo;

public abstract class Asset {
	
	private String name;
	private int price;
	
	public String getName(){return this.name;}
	public int getPrince(){return this.price;}
	
		public Asset(String name,int price){
		this.name = name;
		this.price = price;
	}
}
