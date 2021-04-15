
import java.util.List;

public class StandardPackage {
    String name;
    String status;
	Double cost;
	List<Book> bookList;
	
	public StandardPackage(String name, String status,  List<Book> bookList) {
		super();
		this.name = name;
		this.status = status;
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public void calculateCost() {
		Double total = 0.0;
		
		for(Book book: bookList) {
			total += book.getCost();
		}
		
		this.cost = total;
	}
	public void display() {
		System.out.format("%-25s %-25s %-15s \n","Name","Status","Cost");
		System.out.format("%-25s %-25s %-15s \n",name, status, cost);
		System.out.println("Product Details:");
		System.out.format("%-30s %-40s %-15s %-30s %-15s\n","Name","Description","Cost","Category","Author");
        
		for(Book b: bookList) {
			System.out.println(b);
		}
	}
}
