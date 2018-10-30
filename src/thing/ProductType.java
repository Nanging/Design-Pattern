package thing;

public enum ProductType {
	CABBAGE(0,1),CARROT(1,2),APPLE(2,3),PEAR(3,5),BEEF(4,15),PORK(5,13),EGG(6,2),WOOL(7,7),MILK(8,4);

	private int id;
	private int price;
	private ProductType(int idnum,int pricenum) {
		id=idnum;
		price=pricenum;
	}
	public int getID() {
		return id;
	}
	public int getPrice() {
		return price;
	}
}
