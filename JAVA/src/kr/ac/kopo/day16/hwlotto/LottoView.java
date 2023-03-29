package kr.ac.kopo.day16.hwlotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoView {

	public void start() {
		
//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}
		
	}

	
	/* 1번
	 
	   랜덤 숫자를 lot[]에 넣고 배열을 set에 넣고 그 사이즈가 6보다 작으면 랜덤수를 하나 추가하고
	   그 set을 Object배열에 넣은 뒤 그 배열을 리턴한다 
	  
	private Object[] getLotto() {
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		Object[] obj = new Object[6];
		int[] lot = new int[6];
		for(int i = 0; i < lot.length; i++) {
			lot[i] = r.nextInt(44) + 1;
			set.add(lot[i]);
			
		}   
		while(set.size() < 6) {
			set.add(r.nextInt(44) + 1);
		}
		obj = set.toArray();
		return obj;
	}
	
	
	
	//		실패.....
	/* 배열의 값을 리스트에 넣고.. 리스트에 겹치는 값이 있으면 그 값을 지우고.. 새 랜덤값을 넣으려고 했는데...
	 * 왜 중복값이 나오는걸까요.... 왜.....
	 * 
	private int[] getLotto() {
		Random r = new Random();
		List<Integer> list = new ArrayList<Integer>();
		int[] lot = new int[6];
		for(int i = 0; i < lot.length; i++) {
			lot[i] = r.nextInt(44) + 1;
			list.add(lot[i]);
			if(list.contains(i)) {
				list.remove(i);
				list.add(i,r.nextInt(44) + 1);
				
			}System.out.println(list);
		}
		
		return lot;
	}
	*/
	
	/* 2번
	   리스트에 1부터 45까지의 수를 넣고 리무브로 랜덤값을 지워 그 수를 리턴받는다.
	   	그 값을 배열에 넣는다.
	private int[] getLotto() {
		Random r =new Random();
		List<Integer> list = new ArrayList<Integer>();
		int[] num = new int[6];
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		for(int i = 0; i < num.length; i++) {
			num[i] = list.remove(r.nextInt(list.size()));
			
		}
		return num;
	}
	*/
	
	
/*	죄송합니다 교수님...... 다른 방법이 떠오르지 않습니다........ㅠㅠ
    
  
	private int[] getLotto() {
		Random r = new Random();
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		int r5 = 0;
		int r6 = 0;
		
		while(r1 == r2 || r1 == r3|| r1 == r4 || r1 == r5 || r1 == r6 || r2 == r4 || r2 == r5||
			r2 == r6 || r2 == r3 || r3 == r4 || r3 == r5 || r3 == r6 || r4 == r5 || r4 == r6 || r5 == r6) {
			
			r1 = r.nextInt(44)+1;
			r2 = r.nextInt(44)+1;
			r3 = r.nextInt(44)+1;
			r4 = r.nextInt(44)+1;
			r5 = r.nextInt(44)+1;
			r6 = r.nextInt(44)+1;
		}
		
		int[] num = {r1, r2, r3, r4, r5, r6};
		return num;
				
	}
*/	
	/* 
	private int[] getLotto() {
		Random r = new Random();
		int[] num = new int[6];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					i--;
				}
			}
		}
		return num;
	}
	*/
	
	
	private int[] getLotto() {
		Random r = new Random();
		int[] num = new int[6];
		List<Integer> list = new ArrayList<Integer>();
		
		while(list.size() < 6) {
			int nm = r.nextInt(44)+1;
			if(!list.contains(nm)) {
				list.add(nm);
			}
		}
		Object[] obj = list.toArray();
		for(int i = 0; i < num.length; i++) {
			num[i] = (Integer)obj[i];
		}
		return num;
	}
}












