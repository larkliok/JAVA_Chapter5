
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubscriberInfo obj1
		    = new SubscriberInfo("������", "kaywon", "21347189");
		
		obj1.setPhoneNo("010-3058-7066");
		obj1.setAddress("���� ���� ������");
		
		SubscriberInfo obj2
		    = new SubscriberInfo("������", "mpkk9000", "2911");
		
		obj2.setPhoneNo("010-2911-3403");
		obj2.setAddress("���� ���� ���̵�");
		
		
		
		System.out.println(obj1.name + obj1.id + obj1.password + obj1.address);
		
		
		//System.out.println(obj2.name + obj2.id + obj2.password + obj2.address);
		System.out.println("�̸� : ������" + obj2.name);
		System.out.println("���̵� : kaywon " + obj2.id);
		System.out.println("��й�ȣ : 1234 " + obj2.password);
		System.out.println("��ȭ��ȣ : 010" + obj2.phoneNo);
		System.out.println("�ּ� : �����" + obj2.address);
		
		
		
	}

}

