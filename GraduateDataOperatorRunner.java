class GraduateDataOperatorRunner{
	
  public static void main(String[] names){
	
	System.out.println("main start");
	
	GraduateDataOperator.save("raghu");
	GraduateDataOperator.save("abhi");
	GraduateDataOperator.save("rohan");
	GraduateDataOperator.save("maltesh");
	GraduateDataOperator.save("sangmesh");
	
	GraduateDataOperator.displayDetails();
	
	System.out.println("main end");
	
}

}