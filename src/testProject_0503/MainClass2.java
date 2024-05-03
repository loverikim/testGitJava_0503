package testProject_0503;

import java.util.Scanner; // java.util 패키지안에 있는 라이브러리이기 때문에 임포트 해야함.  

public class MainClass2 {

	public static void main(String[] args) {
		
		// 파이썬의 input 문과 동일한 기능
		Scanner scanner;// Scanner 클래스로 객체를 선언. 
		//scanner = 10;  객체변수 이런식으로 넣는 것은 불가
		scanner = new Scanner(System.in); // 객체 초기화하려면 new 연산자를 처음에 기입해야 함.
		
		//Scanner scanner = new Scanner(System.in); 보통은 이렇게 한줄로 씀.
		// 시스템의 입력장치로부터 유저가 입력한 내용을 입력받을 수 있도록 초기화
		System.out.print("당신의 이름을 입력하세요:");
		String inputData = scanner.nextLine(); // 엔터키를 치기 전까지 입력된 문자열을 가져옴.
		
		System.out.println(inputData);
	}

}
