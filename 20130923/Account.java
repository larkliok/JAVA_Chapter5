
public class Account {
//1. 멤버변수
	String accountNo;
	String ownerName;
	int balanec;
	//2. 생성자
	Account(){
	}
	
	
	
	//3. 멤버 메소드
	void deposit(int account){
		this.balanec += account;
	}
	
	int withdraw(int account){
		if(this.balanec < account){
			return 0;
		}
		return this.balanec -= account;
	}
}
