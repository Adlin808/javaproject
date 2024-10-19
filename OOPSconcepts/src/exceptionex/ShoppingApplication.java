package exceptionex;
class Customer{
	int id;
	String name;
	double walletbalance;
	String address;
	public Customer(int id,String name,double walletbalance,String address) {
		this.id=id;
		this.name=name;
		this.walletbalance=walletbalance;
		this.address=address;
	}
}
class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id,String name,String companyName,double price,boolean isInStock) {
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.price=price;
		this.isInStock=isInStock;
	}
}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message){
		super(message);
	}
}
class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String message) {
		super(message);
	}
}
class ShoppingWebsite{
	public String purchaseItem(Item item,Customer customer)throws ItemOutOfStockException,InsufficientBalanceException{
	if(item.isInStock) {
		throw new ItemOutOfStockException("Item " + item.name + " is out of stock");
	}
	if(customer.walletbalance<item.price) {
		throw new InsufficientBalanceException("Customer" +customer.name+ "has insufficient balance");
	}
	customer.walletbalance=item.price;
	return "Order successful";}
}

public class ShoppingApplication {

	public static void main(String[] args) {
		Customer  customer=new Customer(927392,"Steva",5000.0,"USA");
		Item item=new Item(101,"Tshirt","US polo",800.0,true);
		ShoppingWebsite website=new ShoppingWebsite();
		try {
			String result=website.purchaseItem(item,customer);
			System.out.println(result);
		}catch(ItemOutOfStockException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	

	}

}
