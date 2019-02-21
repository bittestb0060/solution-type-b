package problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = {"3 + 4", "12 * 4", "8 / 2", "10 - 2"};
		
		for(String expression : expressions) {
			String[] tokens = expression.split(" ");
			
			String arith = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);

			
			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.
			// 스페이스로 구분된 문자열을 토큰 배열에 저장 총 3개가 저장됨. 숫자 두개 기호 한개
			// 숫자 두개는 넘1,2에 인트로 변환되서 저장 가운데 기호는 문자열로 저장
			// arith의 기호에 따라 사칙연상을 실행
			// arighmetic 은 데이터타입이 칼큘레이션(int 2ro)
			
			if(arith.equals("+")) {
				int sum;
				sum = num1 + num2;
				System.out.println(sum);
			}
			if(arith.equals("-")) {
				int sum;
				sum = num1 - num2;
				System.out.println(sum);
			}
			if(arith.equals("*")) {
				int sum;
				sum = num1 * num2;
				System.out.println(sum);
			}
			if(arith.equals("/")) {
				int sum;
				sum = num1 / num2;
				System.out.println(sum);
			}
			//이걸 객체지향으로 만들어라...
		
		}
	}
	
	public static Arithmetic getInstance(String arith) {
		
		// 메소드 구현을 완성 하십시오.
		if(arith.equals("+")) {
			Add add = new Add();
			
		}if(arith.equals("-")) {
			
		}if(arith.equals("*")) {
			
		}if(arith.equals("/")) {
			
		}
		
		return null;
	}
}

class Add implements Arithmetic{
	public int calculate(int a, int b) {
		return a+b;
	}
}

class Sub implements Arithmetic{
	public int calculate(int a, int b) {
		return a-b;
	}
}

class Mul implements Arithmetic{
	public int calculate(int a, int b) {
		return a*b;
	}
}

class Div implements Arithmetic{
	public int calculate(int a, int b) {
		return a/b;
	}
}