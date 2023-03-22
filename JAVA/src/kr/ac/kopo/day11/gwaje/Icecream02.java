package kr.ac.kopo.day11.gwaje;

public class Icecream02 {
	
	String name;
	int price;
	static int total;
	
	public Icecream02(){
		
	}
	
	public Icecream02(String name, int price){
		this.name = name;
		this.price = price;
		Icecream02.total += price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public static void totalInfo() {
		System.out.println("총액 : " + Icecream02.total + "원");	
		}
}
