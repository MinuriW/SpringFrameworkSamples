
public class Item {

	private int itemno;
	private String name;
	private double price;
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Item(int itemno, String name, double price) {
		super();
		this.itemno = itemno;
		this.name = name;
		this.price = price;
	}
	public Item() {
		
	}
}
