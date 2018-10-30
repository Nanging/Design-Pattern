package construction;
import thing.Goods;
import thing.Product;

public class BuildingTest {
	
	
	public static void main(String[] args) {
		
		BuildingFactory test=new BuildingFactory();    //���콨��ģ����
		Factory aaa=(Factory)test.produce("factory");  //���칤��
		
		Product a=new Product();                       //ʵ����ԭ��
		a.setType(2);
		a.setNumber(4);
		a.setPrice(5);
		Goods s=aaa.deal(a);                           //�ӹ�ԭ�ϣ��õ���Ʒ���۸񷭱�
		Sale.sale(s);                                  //������Ʒ
		
		Product b=new Product();
		b.setNumber(3);
		b.setPrice(8);
		b.setType(7);
		Sale.sale(b);                                  //����ԭ��
		
		aaa.dealAndSell(b);
	}

}
