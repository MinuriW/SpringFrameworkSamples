
public class Item {

	private int itemno;
	private String name;
	private double price;
	
	public Item(int itemno, String name, double price) {
		super();
		this.itemno = itemno;
		this.name = name;
		this.price = price;
	}
	public Item() {
		
	}
	public double getPrice() {
		return price;
	}
	
	
}
