class  VehicleRunner{

       public static void main(String[]  RangeRover)
   {
       int noOfVehicle=450;
	   String destination="mangalore";
	   System.out.println("transporting initiated");
	   double ref1=Vehicle.Truck(450,"mangalore");
	   System.out.println(ref1);

	   int noOfVehicle1=700;
	   String destination1="Bagalkot";
	   int checkTime=8;
	   System.out.println("changing the adress");
	   double ref2=Vehicle.Truck(700,"Bagalkot",8);
	   System.out.println(ref2);

       String noOfVehicles="large";
	   int num=00001111;
	   String destination2="WTC centre";
	   boolean ref3=Vehicle.Truck("large","WTC centre",num);
	   System.out.println(ref3);

	   String destination3="ladakh";
	   double time=10d;
	   System.out.println("new destination is initiated");
	   System.out.println("truck is on the way");
	   boolean ref4=Vehicle.Truck(time,destination);
	   System.out.println(ref4);

	   int ontime=12;
       System.out.println(" package delivered");
       boolean ref5=Vehicle.Truck(ontime);  


   }


}