class templeDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	templeDataOperator.save("badami");
	templeDataOperator.save("kollur");
	templeDataOperator.save("dharmastsla");
	templeDataOperator.save("kuke");
	templeDataOperator.save("saudatti");
	
	templeDataOperator.displayDetails();
	
	System.out.println("main end");
	
}
}