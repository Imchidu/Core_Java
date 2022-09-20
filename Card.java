class Card{
	static String type;
	static int height;
	static int width;
	static double price;
	static String[] color;
	
	
	static void displaydetails()
	{
		
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(color!=null)
		{
		for(int index=0;index<color.length;index++)
			{
				String ref=color[index];
				System.out.println(ref);
			}
		}
		else{
			System.out.println("Array is null");
			}
		
	}


}