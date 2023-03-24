package kr.ac.kopo.day14.baseballgame;

public class Baseball {
	
	public static void main(String[] args) {
		
		NumberOfCom num = new NumberOfCom();
		
		int[] a = num.nextInt();
		
		for(int i = 0; i < a.length; i++) { //지우고 제출하기!!!!!!!!!!!!
		System.out.println(a[i]);
		}
		
		Input seJari = new Input();
		int s = seJari.input();
		
		BGyo comp = new BGyo();
		comp.compare(s, a);
		
		
	}
	
	

}

