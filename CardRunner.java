class CardRunner{
  
  public static void main(String[] args)
  {
	System.out.println("Entered debit card");
	
	Card.displaydetails();
	
	Card.type="debit";
	Card.height=85;
	Card.width=53;
	Card.price=150d;
	String[] black={"brown","grey","pink","voilet","yellow","green"};
	Card.color=black;
	
	Card.displaydetails();
	
	System.out.println("Ending the card");
		
}



}