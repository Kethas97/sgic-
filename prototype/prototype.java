package practices;

public class prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs=new BookShop();
		bs.setShopName("kamalBookShop");
		bs.load();
		
		
		
		BookShop bs1=(BookShop) bs.clone();
		bs1.setShopName("StrBookShop");
		
	
		System.out.println(bs);
		System.out.println(bs1);
	}

}
