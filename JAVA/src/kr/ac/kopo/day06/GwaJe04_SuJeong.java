package kr.ac.kopo.day06;

public class GwaJe04_SuJeong {
	
	public static void main(String[] args) {
		
		int snail = 0, hour = 0;	//몇번 돌 지 모르기때문에 while문을 써주는 게 좋다.
		
		while(snail < 100) {
		snail += (snail < 50 ? 5-1 : 5-2); //1미터 2미터 미끄러짐
		System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
		}
		
		
		
		
		/*
		while((snail += 5) < 100){	//5m 올라간 높이가 100이 넘으면 탈출!(5m 오른 후 미끄러지는 것이기 때문)
		
		snail += (snail < 50 ? -1 : -2); //snail에 조건을 넣어준다.
		System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
		}
		System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
		*/
		
		
		
		
		/*
		while(snail < 100){	//몇번 돌 지 모르기때문에 while문을 써주는 게 좋다.
			snail += 5; //달팽이는 한시간에 5m 씩 오른다.
			snail += (snail < 50 ? -1 : -2); //snail에 조건을 넣어준다.
			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
			}
		*/
		
	
		
		
		
		/*
		int i = 0;
		int j = 1;
		
		while(i <= 100) {
			if(i < 50) {
				i = i+4;
				if(i > 50) {
					i--;
				}
			} else {
				i = i+3;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %d\n",j,i);
			j++;
		}
		*/
	}
	
}