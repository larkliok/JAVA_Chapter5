/**
 * ��ǰ ��� Ŭ����
 * @author ������
 *
 */
public class Goodstock {
	//�ʵ�(�������)
	String goodsCode;
	int stockNum;
	//������
	
	//public Goodstock(){}
	
	//(�⺻ ������ ����)
	public Goodstock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	//��� �޼ҵ�
	
	/**
	 * ��� ���Ѵ� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : �߰��ϱ� ���� ���
	 */
	void addStock(int amount){
		stockNum += amount; //stockNum = stockNum  + amount;
	}
	
	/**
	 * ��� �A�� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : ���� ���� ���
	 * @return : ���� ���� ���
	 */
	int sudstractStock(int amount){
		if(stockNum < amount){
			return 0;
		}
		stockNum -=amount; //stockNum = stockNum - amount;
		return amount;
	}
}
