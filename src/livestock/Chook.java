package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
//�̳�Livestock��
public class Chook extends Livestock{
	//���캯��
	public Chook (int id)
	{
		super(id,species.chook,species.chook.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.EGG,6));
		newCarrier.carryToWareHouse();
		
	}
	//�ռ���
	public boolean getEgg() {
		//�����µ�
		if(nowstate.getState()==1)
		{
			System.out.println("��ü���");
			//��ü���
			
			//���ü���״̬
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		//��δ�µ�
		else {
			System.out.println("û�м���");
			return false;
		}
	}

}
