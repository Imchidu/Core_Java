class Company{

 static boolean companyPack(String company1,int salary)
 { 

	 System.out.println("entering comapany and salary");
	 if(salary>=1350000)
	 {
		 System.out.println("my salary is high");
		 return true;                                
	 }
	 if(company1=="flipkart") 
	 {
		 System.out.println("flipkart IS wonderful");
		 return true;
	 }
	     return false;
 }
 static int companyPack(String company2,int salary1,String designation)
	{
		System.out.println("comapanies,salary and designation of employeee");
		System.out.println(designation);
		 return 35;
	}

 }