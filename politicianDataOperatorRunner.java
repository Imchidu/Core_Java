class politicianDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	templeDataOperator.save("modi");
	templeDataOperator.save("yogi");
	templeDataOperator.save("shah");
	templeDataOperator.save("yatnal");
	templeDataOperator.save("bommai");
	
	movieDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}