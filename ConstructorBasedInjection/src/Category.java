import java.util.List;

public class Category {

	private String categoryName;
	private String description;
	private List<Item> itemList;
	public Category(String categoryName, String description, List<Item> itemList) {
		super();
		this.categoryName = categoryName;
		this.description = description;
		this.itemList = itemList;
	}
	
	public Category() {
		
	}
	
	public double totalCost() {
		
		double total=0.0;
		for(Item i:itemList) {
			total=total+i.getPrice();
		}
		return total;
	}
}
