
public class typeCastingExam {
	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		System.out.println(y);
		
//		int x2 = 6;
//		long y2 = x2;
//		System.out.println(y2);
		// 더 큰 데이터타입에서 작은 데이터타입으로는 옮기면 컴파일러에서 오류가 생김 
		
		int x3 = 5;
		long y3 = (int) x3;
		System.out.println(y3);
	}

}
