public interface BevShopInterface {
	int MIN_AGE_FOR_ALCOHOL = 21;  //Minimum age for offering alcohol drink
	int MAX_ORDER_FOR_ALCOHOL= 3;   /*Maximum number of alcohol beverages
									that can be ordered within an order  */
	int MIN_TIME= 8;				//earliest time for the order
	int MAX_TIME= 23;				//latest  time for the order
	int MAX_FRUIT = 5;				//Maximum number of fruits that this shop offers for SMOOTHIE beverage
	
	/*
	 Checks if the time is valid (between 8 and 23 ) time represents the time 
	 return true if times is within the range of 8 to 23 , false otherwise
	 */
	public boolean validTime(int time);
	

	/*
	  checks if the number of alcohol beverages for the current order has reached the maximum
	  return true if number of alcohol drinks for the current order has reached the maximum , false otherwise
	 */
	public boolean eligibleForMore();
	
	/*
	  check the valid age for the alcohol drink age is the customer age  
	  returns true if age is more than minimum eligible age , false otherwise  
	 */
	public boolean validAge(int age);
	
	// creates a new order ,  NO BEVERAGE is added to the order yet
	public void startNewOrder(int time,
						 	DAY day,
						 	String customerName,
						 	int customerAge);
	
	// process the Coffee order for the current order by adding it to the current order
	public void processCoffeeOrder( String bevName,
									SIZE size,
									boolean extraShot,
									boolean extraSyrup );
	
	// process the Alcohol order for the current order by adding it to the current order
	public void  processAlcoholOrder( String bevName,
									SIZE size );
	
	// process the Smoothie order for the current order  by adding it to the current order
	public void processSmoothieOrder( String bevName,
									SIZE size,
									int numOfFruits,
									boolean addProtien);
	
	// locate an order based on  the order number
	public int findOrder(int orderNo);
	
	// locates an order in the list of orders and returns the total value on the order.
	public double totalOrderPrice(int orderNo);
	
	// calculates the total sale of all the orders for this beverage shop
	public double totalMonthlySale();
		
	// sorts the orders within this bevShop using the Selection	 
	public void sortOrders();
	
	// returns Order in the list of orders at the index
	public Order getOrderAtIndex(int index);
}