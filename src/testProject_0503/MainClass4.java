package testProject_0503;

public class MainClass4 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		int result1= ++x; // x = x + 1
		int result2 = y++; // y = y + 1				
		
		// 증감 연산자 위치에 따라 결과가 달라질 수 있음에 주의!		
		// 증감연산자는 위치가 앞에 있냐 뒤에 있냐에 따라 달라짐.
		
		System.out.println(result1); // 11
		System.out.println(x); // 11
		System.out.println(result2); // 20
		System.out.println(y); // 21
		
		int a = 1;
		int result3 = ++a + 10; //--> 2+10 
				
		System.out.println(result3); // 12
		System.out.println(a); // 2
		//증감연산자 앞에 있으면 우선순위가 올라감		
		
		int b = 1;
		int result4 = b++ + 10;
				
		System.out.println(result4); // 11
		System.out.println(b); // 2		
		//증감연산자 뒤에 있으면 우선순위가 내려감
		
		
		int sum = 0;
		int i = 10;
		
		sum = sum + i;		
		sum += i; // sum = sum + i;
		
		sum = sum * i;		
		sum *= i ; // sum = sum * i; 
		
		// 삼항 연산자 -> 간단한 if문을 한줄로 쓴 경우
		
		
				
	}

}
