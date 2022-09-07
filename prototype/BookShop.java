package practices;

import java.util.ArrayList;
import java.util.List;
 
public class BookShop implements cloneable {
	
	private String ShopName;
	
	List<Book> books=new ArrayList<>();

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", books=" + books + "]";
	}

	
	public void load() {
		for(int i=1;i<10;i++) {
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			
			getBooks().add(b);
		}
		

		
	}

	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
	 BookShop shop =new BookShop();
	 
	 for(Book b: this.getBooks()) {
		shop.getBooks().add(b);
	 }
	 return shop;
	}

	
}
