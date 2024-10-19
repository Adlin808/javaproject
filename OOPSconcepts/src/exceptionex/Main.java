package exceptionex;

class StockHighException extends Exception {
	public StockHighException(String msg) {
		super(msg);
	}
}

class StockLowException extends Exception {
	public StockLowException(String msg) {
		super(msg);
	}

}

class Stocks {
	float stockRate;

	public Stocks(float StockRate) {
		this.stockRate = stockRate;
	}

	public String checkRate(float rate) throws StockHighException, StockLowException {
		if (rate == stockRate * 0.8) {
			return "Hope to raise";
		} else if (rate < stockRate * 0.8) {
			throw new StockLowException("under loss");
		} else if (rate > stockRate * 0.8) {
			throw new StockHighException("Under Profit");
		}
		return "No change";
	}
}

public class Main {

	public static void main(String[] args) {
		try {
			Stocks stock = new Stocks(10.0f);
			System.out.println(stock.checkRate(5.0f));
		} catch (StockHighException e) {
			System.out.println(e.getMessage());
		} catch (StockLowException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
