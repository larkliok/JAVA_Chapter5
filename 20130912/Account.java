
public class Account {
//1. �������
	String accountNo;
	String ownerName;
	int balanec;
	//2. ������
	Account(){
	}
	
	
	
	//3. ��� �޼ҵ�
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
