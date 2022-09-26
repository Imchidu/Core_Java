class GraduateDataOperator
{

 static String[] GraduateNames={null,null,null,null,null};

 static int position=0;

 static void save(String name){
	 
	System.out.println("save start");
	
    GraduateNames[position]=name;	
	
	System.out.println("GraduateName in postion "+position+" is "+GraduateNames[position]);
		position++;
		
	System.out.println("save end");
	 
 } 
    	static void displayDetails()
		
	{
		System.out.println("displayDetails start");
			
		for (int index=0;index<GraduateNames.length;index++)
		{
		 System.out.println("element is : "+GraduateNames[index]);	
				
		}
			
			
	}



}