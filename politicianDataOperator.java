class politicianDataOperator{

 static String[] politicianNames={null,null,null,null,null};

 static int position=0;

 static void save(String name){
	 
	System.out.println("save start");
	
    politicianNames[position]=name;	
	
	System.out.println("politicianName in postion "+position+" is "+politicianNames[position]);
		position++;
		
	System.out.println("save end");
	 
 } 
    	static void displayDetails()
		
	{
		System.out.println("displayDetails start");
			
		for (int index=0;index<politicianNames.length;index++)
		{
		 System.out.println("element is : "+politicianNames[index]);	
				
		}
			
			
	}



}