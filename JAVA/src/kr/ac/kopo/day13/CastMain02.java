package kr.ac.kopo.day13;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		//컴파일 오류 발생
		//Child01 c = new Parent();
		
		//실행 시 오류 발생
		//Child01 c = (Child01)new Parent();
		
		Parent p = new Child01();
		Child01 c = (Child01)p;	//묵시적 형변환을 해줘야만 명시적 형변환 가능! 그래야 메모리 공간이 생성되기 때문!!!
		
	}

}
