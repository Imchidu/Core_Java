class movieDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	movieDataOperator.save("A");
	movieDataOperator.save("UPENDRA");
	movieDataOperator.save("SUPER");
	movieDataOperator.save("UPPI2");
	movieDataOperator.save("UI");
	
	movieDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}