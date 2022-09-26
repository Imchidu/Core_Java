class FoodItemDataOperator{

 static String[] FoodItemNames={null,null,null,null,null};

 static int position=0;

 static void save(String name){
	 
	System.out.println("save start");
	
    FoodItemNames[position]=name;	
	
	System.out.println("FoodItemName in postion "+position+" is "+FoodItemNames[position]);
		position++;
		
	System.out.println("save end");
	 
 } 
    	static void displayDetails()
		
	{
		System.out.println("displayDetails start");
			
		for (int index=0;index<FoodItemNames.length;index++)
		{
		 System.out.println("element is : "+FoodItemNames[index]);	
				
		}
			
			
	}



}