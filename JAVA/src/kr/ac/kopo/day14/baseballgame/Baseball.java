package kr.ac.kopo.day14.baseballgame;

public class Baseball {
	
	public static void main(String[] args) {
		
		
		NumberOfCom num = new NumberOfCom();
		
		int[] a = num.nextInt();
		

		for (int i = 0; i <= 5; i++) {
			Input seJari = new Input();
			int s = seJari.input();
			
			BGyo comp = new BGyo();

			int[] b = comp.compare(s, a);
			
			
			System.out.println("기회는 총" + (5-i) + "회 남았습니다");
			if(i == 5) {
				System.out.printf("기회를 모두 소진하셨습니다.\n정답은 %d%d%d입니다.",a[0],a[1],a[2]);
			}
		}

	}
	

}

