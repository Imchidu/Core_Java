class movieDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	templeDataOperator.save("A");
	templeDataOperator.save("UPENDRA");
	templeDataOperator.save("SUPER");
	templeDataOperator.save("UPPI2");
	templeDataOperator.save("UI");
	
	movieDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}