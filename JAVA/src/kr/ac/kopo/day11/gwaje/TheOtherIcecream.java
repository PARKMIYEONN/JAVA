package kr.ac.kopo.day11.gwaje;

public class TheOtherIcecream {
	
	String name;
	int price;
	
	TheOtherIcecream(){
		
	}
	
	TheOtherIcecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void dalcom(int iC) {
		System.out.printf("***%d번째 아이스크림 구매 정보 입력",iC);
	}

}
