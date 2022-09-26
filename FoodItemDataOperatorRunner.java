class FoodItemDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	FoodItemDataOperator.save("milk");
	FoodItemDataOperator.save("curd");
	FoodItemDataOperator.save("bread");
	FoodItemDataOperator.save("rice");
	FoodItemDataOperator.save("biscuit");
	
	FoodItemDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}