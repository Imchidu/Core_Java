class FoodItemDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	templeDataOperator.save("milk");
	templeDataOperator.save("curd");
	templeDataOperator.save("bread");
	templeDataOperator.save("rice");
	templeDataOperator.save("biscuit");
	
	FoodItemDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}