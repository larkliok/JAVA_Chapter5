
public class AccountMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Account obj1 = new Account("000-001", "������", 1000000);
	  obj1.deposit(50000);
	  
	  StringBuffer str = new StringBuffer("����������б�");
	  str.insert(2, "����");
	  str.append(":������");
	  str.delete(2, 4);
	  System.out.print(str);
	}

}
