package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 
	// 객체비교를 통해 동일하게 나온다는ㄱ 뭔뜻이지
	
	private int amount;
	
	public Money(int amount) { //생성자 amount의 값을 갖는 생성자 머니클래스
		this.amount = amount;
		
	}

	public Money add(Money money) {
		this.amount = this.amount + money.amount;
		//Money m = amount;
		//Money = m;
		//return Money(5);
		//return Money(amount);
		return this;
	}

	public Money minus(Money money) {
		this.amount = this.amount - money.amount;
		return this;
	}

	public Money multiply(Money money) {
		this.amount = this.amount * money.amount;
		return this;
	}

	public Money devide(Money money) {
		this.amount = this.amount/money.amount;
		return this;
	}
}