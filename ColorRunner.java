class ColorRunner{
   public static void main(String [] args)
	{
		System.out.println("main start agtha ede");
		
		Color.save("orange");
		Color.save("yellow ");
		Color.save("red");
		Color.save("Black");
		Color.save("green");
		Color.save("white");
		Color.save("grey");
		Color.save("voilet");
		Color.save("brown");
		
		Color.displayColors();
		boolean found=Color.find("orange");
		System.out.println("Finding colors is "+found);
		
	}







}