package kr.ac.kopo.day11.gwaje;

import kr.ac.kopo.day10.ScannerUtil;
public class IcecreamMarket {
	
	void open() {
												//멤버변수는 잘 안 보여주고 싶어. 프라이빗
												//메소드로 멤버변수를 간접적으로 접근하기 때문에 메소드는 보통 퍼블릭으로 만듦
		ScannerUtil scan = new ScannerUtil();	//new 앞에 아무것도 안 적혀있으면 default : 같은 패키지 내에서만 공유 가능.
		
		int cnt = scan.nextInt("아이스크림 몇개 살래? ");
		Icecream02[] iceArr = new Icecream02[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 입력 ***\n", i+1);
			String name = scan.nextString("아이스크림 이름 : ");
			int price = scan.nextInt("아이스크림 가격 : ");
			
			iceArr[i] = new Icecream02(name, price);
			}
		System.out.printf("< 총 %d개 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("-------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("-------------------------------");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName() + "\t\t" + iceArr[i].getPrice());
		}
		System.out.println("-------------------------------");
		Icecream02.totalInfo();
	}

}
