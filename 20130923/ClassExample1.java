
public class ClassExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Goodstock obj;
		Goodstock obj1;
		//obj = new Goodstock();
		//obj = new Goodstock();
		//Goodstock obj = new Goodstock();
		//Goodstock obj1 = new Goodstock();
		
		//obj.goodsCode = "52135";
		//obj.stpckNum = 200;
		
		obj = new Goodstock("52135", 200);
		obj1 = new Goodstock("52135",300);
		
		
		
		
		System.out.println("상풍코드 : " + obj.goodsCode);
		System.out.println("재고수량 : " + obj.stockNum);
		
		obj.addStock(100);
		
		System.out.println("상풍코드 : " + obj.goodsCode);
		System.out.println("재고수량 : " + obj.stockNum);
		
		obj.sudstractStock(200);
		System.out.println("상풍코드 : " + obj.goodsCode);
		System.out.println("재고수량 : " + obj.stockNum);
		

		
	}

}
