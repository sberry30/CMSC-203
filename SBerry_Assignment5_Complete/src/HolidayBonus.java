//Calculate the holiday bonuses
public class HolidayBonus {

  
   // Calculates the holiday bonus for each store

  public static double[] calculateHolidayBonus(double[][] data, double high, double low,
      double other) {
    double[] bonuses = new double[data.length];
    
    //find max # of categories
    int maxCol = 0;
    for (int i = 0;i < data.length;i++) {
      if (maxCol < data[i].length) {
        maxCol = data[i].length;
      }
    }
    
    for (int j = 0;j < maxCol;j++) {
      // add bonus for high or low in each category
      int highBonusIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
      int lowBonusIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
      
      // sales must be positive to get high bonus
      if (TwoDimRaggedArrayUtility.getHighestInColumn(data, j) > 0) {  
        bonuses[highBonusIndex] += high;
      }
      
      // sales must be positive and different from high to get low bonus
      if (TwoDimRaggedArrayUtility.getLowestInColumn(data, j) > 0 && highBonusIndex!=lowBonusIndex ) {
        bonuses[lowBonusIndex] += low;
      }
      
      // add OTHER bonus to the other stores unless not category available if sales are positive 
      for (int i = 0;i < data.length;i++) {
        if (j >= data[i].length || i==highBonusIndex || i==lowBonusIndex || data[i][j] <= 0) {
          continue;
        } else {
          bonuses[i] += other;
        } 
        System.out.println();
      }
    }   
    return bonuses;
  }

  
   // Calculates the total holiday bonuses

   
  public static double calculateTotalHolidayBonus(double[][] data, double high, double low,
      double other) {
    
    double[] bonusArray = calculateHolidayBonus(data, high, low, other);
    double total = 0;
    
    for (double bonus:bonusArray) {
      total+=bonus;
    }
    return total;
  }
}