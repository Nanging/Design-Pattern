package construction;
import thing.Goods;
import thing.Product;

public class BuildingTest {
	
	
	public static void main(String[] args) {
		
		BuildingFactory test=new BuildingFactory();    //建造建筑模板类
		Factory aaa=(Factory)test.produce("factory");  //建造工厂
		
		Product a=new Product();                       //实例化原料
		a.setType(2);
		a.setNumber(4);
		a.setPrice(5);
		Goods s=aaa.deal(a);                           //加工原料，得到商品，价格翻倍
		Sale.sale(s);                                  //售卖商品
		
		Product b=new Product();
		b.setNumber(3);
		b.setPrice(8);
		b.setType(7);
		Sale.sale(b);                                  //售卖原料
	}

}
