/**
 * 상품 재고 클래스
 * @author 정희정
 *
 */
public class Goodstock {
	//필드(멤버변수)
	String goodsCode;
	int stockNum;
	//생성자
	
	//public Goodstock(){}
	
	//(기본 생성자 생략)
	public Goodstock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	//멤버 메소드
	
	/**
	 * 재고를 더한다 기능에 해당하는 메소드
	 * @param amount : 추가하기 위한 재고량
	 */
	void addStock(int amount){
		stockNum += amount; //stockNum = stockNum  + amount;
	}
	
	/**
	 * 재고를 뺸다 기능에 해당하는 메소드
	 * @param amount : 뺴기 위한 재고량
	 * @return : 뺴기 위한 재고량
	 */
	int sudstractStock(int amount){
		if(stockNum < amount){
			return 0;
		}
		stockNum -=amount; //stockNum = stockNum - amount;
		return amount;
	}
}
