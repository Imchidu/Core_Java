class CompanyRunner
{
   public static void main(String[]  games)
   {

	     int  salary=1800000;
	     int salary1=87500000;
	     String company1="flipkart";
	     String company2="microsoft";
		 
	   	 System.out.println("flipkart");
         boolean ref=Company.companyPack("flipkart",1800000);
	 	 System.out.println(ref);

		 String designation="Developer";
		 int ref1=Company.companyPack("microsoft",87500000,"Developer");
		 System.out.println(ref1);
   }      

}