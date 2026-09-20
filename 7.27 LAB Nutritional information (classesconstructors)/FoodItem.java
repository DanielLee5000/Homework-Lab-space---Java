/*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.27 LAB: Nutritional information (classes/constructors)
 * Initial file comment:
 * The program will help user to initialization and print FoodItem info.
 * With three variables name, fat, carbs and protein.
 * With two constructor to initialize and set the input.
 * The program then will allow user to caculate and call functions to print info.
 */

public class FoodItem {
   private String name;
   private double fat;
   private double carbs;
   private double protein;
   
   public FoodItem(){
      name = "Water";
      fat = 0.0;
      carbs = 0.0;
      protein = 0.0;
   }

   public FoodItem(String name, double fat, double carbs, double protein){
      this.name = name;
      this.fat = fat;
      this.carbs = carbs;
      this.protein = protein;
   }
   
   public String getName() {
      return name;
   }
   
   public double getFat() {
      return fat;
   }
   
   public double getCarbs() {
      return carbs;
   }
   
   public double getProtein() {
      return protein;
   }
   
   public double getCalories(double numServings) {
      // Calorie formula
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }
   
   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}