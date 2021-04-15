import java.util.List;
import java.util.Map;

public class Category {
	private String categoryname;
	private String description;
	private List<Item> list;
	//private Map<String, Item> map;
	public Category() {
		
	}
	public Category(String categoryname, String description, List<Item> list) {
		this.categoryname = categoryname;
		this.description = description;
		this.list = list;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Item> getList() {
		return list;
	}
	public void setList(List<Item> list) {
		this.list = list;
	}
	public double getTotal() {
		double total=0.0;
		for(Item i:list) {
			total = total+i.getPrice();
		}
		return total;
		/*for (String no : map.keySet())  
            System.out.println("key: " + no); 
        for (Item i : map.values())  
            System.out.println("value: " + i.getPrice());*/
     }
}
