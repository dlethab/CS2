
public class Stock {
	
	//quesiton doesn't really require me to initialize string variables here
	double closing;
	double current;
	
	Stock() {
		
	}
	
	Stock(String newSymbol, String newName, double previousClosingPrice, double currentPrice) {
		closing = previousClosingPrice;
		current = currentPrice;
		
	}
	
	
	void getChangePercent() { //returns statement of percentage
		double percent = (current / closing) - 1.0;
		System.out.print("Percent growth for from " + current + " to " + closing + " is: ");
		System.out.printf("%2.2f", percent*100); //formatted to show 2 decimals how stocks usually are	
		
	}
	
	public static void main(String[] args) {
		Stock orcl = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		orcl.getChangePercent();
		
	}

}
