class Foods{
	public static void main(String[] items)
	{
		int rice=120;
		int wheat=60;
		int dal=100;
		int oil=150;
		int ragi=90;
		int sugar=40;
		int salt=20;
		int teapowder=80;
		int coffeepowwder=110;
		int chocolate=80;
		int ketchup=40;
		int bread=30;
		int biscuit=50;
		int masalapowder=60;
		
		int[] total={rice,wheat,dal,oil,ragi,sugar,salt,teapowder,chocolate,ketchup,bread,biscuit,masalapowder};	
		int price=total.length;
		System.out.println("total:"+price);
		
		int ghee=35;
		int cheese=87;
		total[3]=ghee;
		total[7]=cheese;
		
		for(int one=0;one<total.length;one++)
		{
			int ref=total[one];
			System.out.println(ref);
		}
		
		
		
		
		
		
		
		
	
	}
	
	
	
}