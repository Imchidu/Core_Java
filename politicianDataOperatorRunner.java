class politicianDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	politicianDataOperator.save("modi");
	politicianDataOperator.save("yogi");
	politicianDataOperator.save("shah");
	politicianDataOperator.save("yatnal");
	politicianDataOperator.save("bommai");
	
	politicianDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}