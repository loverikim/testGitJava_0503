package testProject_0503;

public class MainClass3 {

	public static void main(String[] args) {
		
		
		// java의 if문 형식
//		if (10>50) {
//			System.out.println("10은 50보다 크다.");
//		}else {
//			System.out.println("10은 50보다 작다.");
//		}
		
		// 숫자 값일 경운는 부등호로 비교함.
		int num = 100; // 일반타입 변수로 만들어짐.
		if(num ==100) { // 숫자값을 비교할때는 부등호를 사용(==)
			System.out.println("축하합니다." + num + "점 입니다.");
		}
		
		// 문자열을 비교할 때
		// .equals를 활용하여 객체 비교를 해야함.
		String str1 = "KOREA"; // Class로 선언된 객체로 만들어짐. 
		String str2 = "KOREA";
		if (str1.equals(str2)) { // 문자열을 비교할때는 == 쓰지말고, equals로 비교-> 그래야 정확한 비교결과를 알수 있다.
			System.out.println("당신은 한국인 입니다!");
		}

	}

}
