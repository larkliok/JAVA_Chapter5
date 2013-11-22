
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubscriberInfo obj1
		    = new SubscriberInfo("정희정", "kaywon", "21347189");
		
		obj1.setPhoneNo("010-3058-7066");
		obj1.setAddress("서울 은평구 갈현동");
		
		SubscriberInfo obj2
		    = new SubscriberInfo("차문석", "mpkk9000", "2911");
		
		obj2.setPhoneNo("010-2911-3403");
		obj2.setAddress("서울 은평구 역촌동");
		
		
		
		System.out.println(obj1.name + obj1.id + obj1.password + obj1.address);
		
		
		//System.out.println(obj2.name + obj2.id + obj2.password + obj2.address);
		System.out.println("이름 : 정원수" + obj2.name);
		System.out.println("아이디 : kaywon " + obj2.id);
		System.out.println("비밀번호 : 1234 " + obj2.password);
		System.out.println("전화번호 : 010" + obj2.phoneNo);
		System.out.println("주소 : 서울시" + obj2.address);
		
		
		
	}

}

