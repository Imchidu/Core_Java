class Tablet{

   static String type;
   static double price;
   static char size;
   static int height;
   static int width;
   static int mfgdate;
   static int expdate;
   static String color;
   static String shipping;
   static String[] chemicals;
   static String[] name;
   static String[] shape;
   static String[] used;
   static String[] transport;
   static String[] weight;
   static String[] packing;
   
   static void TabletProperties()
   {
	System.out.println(type);
	System.out.println(price);
	System.out.println(size);
	System.out.println(height);
	System.out.println(width);
	System.out.println(mfgdate);
	System.out.println(expdate);
	System.out.println(color);
    System.out.println(shipping);
	
	if(chemicals!=null)
	{
		for(int index=0;index<chemicals.length;index++)
		{
			String ref=chemicals[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is null");
	}
	
	
	if(name!=null)
	{
		for(int index=0;index<name.length;index++)
		{
			String ref=name[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is not null");
	}
	
	if(shape!=null)
	{
		for(int index=0;index<shape.length;index++)
		{
			String ref=shape[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is null");
	}
	
	if(used!=null)
	{
		for(int index=0;index<used.length;index++)
		{
			String ref=used[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is not null");
	}

	if(transport!=null)
	{
		for(int index=0;index<transport.length;index++)
		{
			String ref=transport[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is null");
	}

	if(weight!=null)
	{
		for(int index=0;index<weight.length;index++)
		{
			String ref=weight[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is not null");
	}
	if(packing!=null)
	{
		for(int index=0;index<packing.length;index++)
		{
			String ref=packing[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is null");
	}



	
   }
  



  
}