class TabletRunner{
 
  public static void main (String[] args)
  {
	  System.out.println("Entering description of tablet");
	  
	  Tablet.TabletProperties();

	  Tablet.type="oral drug";
      Tablet.price=50.80d;	  
	  Tablet.size='S';
	  Tablet.height=10;
	  Tablet.width=5;
	  Tablet.mfgdate=2020;
	  Tablet.expdate=2023;
	  Tablet.color="white";
	  Tablet.shipping=" done";
	  
	  String[] drug={"chemicalcompostions","drugs","acids"};
	  Tablet.chemicals=drug;

      String[] hesaru={"paracetamol","fever","ache"};
	  Tablet.name=hesaru;

		String[] square={"round","rec","round"};
	  Tablet.shape=square;

      String[] tabs={"pain","swelling","cramps"};
	  Tablet.used=tabs;
	  
	  String[] vehicle={"bus","van","goods carrier"};
	  Tablet.transport=vehicle;
	
      String[] grams={"20","50","25"};
	  Tablet.weight=grams;
   
      String[] lab={"daily","weekly","monthly"};
	  Tablet.packing=lab;
	
  }


}