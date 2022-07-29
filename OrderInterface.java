
public interface OrderInterface  {


	// true if weekend
	 public boolean isWeekend();

	// returns the beverage listed in the itemNo of the order
	 public Beverage getBeverage(int itemNo);
	 
	// adds a new coffee to the order
	public void  addNewBeverage(
				String bevName,
				SIZE size,
				boolean extraShot,
				boolean extraSyrup);

	// adds a new alcoholic beverage to the order
	public void  addNewBeverage( String bevName,
								SIZE size);

	// adds a new smoothie to the order
	public void  addNewBeverage( String bevName,
				SIZE size,
				int numOfFruits,
				boolean addProtien);

	// calculates and finds the customer's total for their order
	public double calcOrderTotal();
	
	// returns the number of same type beverages in the order
	public int findNumOfBeveType(TYPE type);
}
