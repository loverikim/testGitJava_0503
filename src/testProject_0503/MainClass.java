package testProject_0503;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld"); //콘솔창으로 출력하는 print문 형식
		System.out.println("helloworld");
		System.out.println("helloworld");
		
		
		//####################### 변수 선언 ###############################
		
		int numInt; //빈공간만 만들어진 상태 값은 정수만 들어갈 수 있음. (정수 변수 선언)
		numInt = 10; //선언한 후에 초기화 해도되고(초기값 설정)
		//int num = 10; 선언과 동시에 초기값을 넣어주어도 됨.
		
		double numDouble; // 실수 변수 선언
		numDouble = 3.14; // 초기값 설정
		
		String str; // 문자열 변수 선언
		str = "Korea"; // 초기값 설정
		
		boolean logi; //논리형 변수 선언(true, false)
		logi = true; // 초기값 설정
		
		char ch; // 주의) 문자 변수 선언(1글자 저장)-> ''로 저장해야함. 문자는 작은 따옴표만!!!!! 
		ch = 'A';
		
		char ch2 = 65; // 정수를 char 변수에 저장하면 해당정수가 가리키는 아스키코드 문자가 저장
		System.out.println(ch2); 
		
		
		// ####################### 형 변환 ###############################
		// 파이썬 : (int)numDouble -> 정수로 형 변환
		
		
		// ####################### 임시 형변환 ###############################
		// 자바는 선언한 이후에 사용.
		int dint = (int)numDouble; //임시 형변환 
		System.out.println(dint);
		
		double idou= (double)numInt;
		System.out.println(idou);
		
		// 파이썬 : (int)strInt -> 문자열 숫자 -> 정수로 형변환
		// int strSample = (int)strInt; // java에서는 임시 형변환으로 문자열을 숫자(정수,실수)로 변환 불가.
		// --> wrapper 클래스를 사용하여 문자열 ->정수(실수) 형변환 해야함.
		
		//############# wrapper클래스를 사용하여 형변환 ###################
		//class사용 형변환은 첫글자는 대문자로 시작

		String strInt = "1000";		
		int strSample = Integer.parseInt(strInt);  // java.lang 내장 라이브러리를 가져다가 씀. 무조건 사용해야 하는 것이기 때문
		System.out.println(strSample); // 문자열 "1000" -> 정수 1000으로 변환
		
		String strDouble = "3.14";
		double strSample2 = Double.parseDouble(strDouble); //문자열 "3.14" -> 실수 3.14로 변환
		System.out.println(strSample2); 
		
		// 정수(실수)를 문자열로 변환
		// 파이썬 : (str)1000 -> 문자열로 취급
		
		int num1 = 157;
		String numStr1 = String.valueOf(num1); // 문자열 -> 정수로 변환
		System.out.println(numStr1);
		
		
		System.out.println("문자열로 변환된 값:" + numStr1);
		
		// 파이썬의 f스트링 같은 형식 문자 위의 내용이 더 편함. 자주씀. 위아래 둘다 사용가능
		// 형식 문자열
		System.out.printf("정수값 출력: %d", num1);
		
	}

}
