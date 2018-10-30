package thing;

public class Goods implements Cloneable{
	
	private int id;
	private int price;
	private int number;
	private String goodsType;
	
	public int getNumber() {
		return this.number;
	}
	
	public int setNumber(int number) {
		this.number=number;
		return this.number;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setGoodsType(String goodsType){
		this.goodsType=goodsType;
	}
	
	public String getGoodsType(){
		return this.goodsType;
	}
	
	public Object clone() {
	      Object clone = null;
	      try {
	         clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	   }
}
