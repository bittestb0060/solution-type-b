package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 
	//
	
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
		// 머니의 데이터타입이 변했는데 그걸 어떻게 반환하지?
		// amount로 머니 데이터타입비교
		Money m = new Money(amount);
		return m;
	}

	public Money minus(Money money) {
		this.amount = this.amount - money.amount;
		Money m = new Money(amount);
		return m;
	}

	public Money multiply(Money money) {
		this.amount = this.amount * money.amount;
		Money m = new Money(amount);
		return m;
	}

	public Money devide(Money money) {
		this.amount = this.amount/money.amount;
		Money m = new Money(amount);
		return m;
	}
}