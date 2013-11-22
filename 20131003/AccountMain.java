
public class AccountMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Account obj1 = new Account("000-001", "정희정", 1000000);
	  obj1.deposit(50000);
	  
	  StringBuffer str = new StringBuffer("계원예술대학교");
	  str.insert(2, "예술");
	  str.append(":정희정");
	  str.delete(2, 4);
	  System.out.print(str);
	}

}
