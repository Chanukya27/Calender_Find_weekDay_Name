import java.util.Scanner;
//0,3,3,6,1,4,6,2,5,0,3,5
public class FindTheDay {
   static final int WEEK = 7; 
   static final int MONTH = 12;
   static int resultant =0;
   static int findingDayName ;
   static int year,month,day;
   static String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
   static int monthTemp;
   static int YearTemp,yearRem;
   public static void findTheDay(){
	   System.out.println("You have entered the date formate is: ***DD-MM-YYYY***");
	   System.out.println("You have entered the date formate is: " +day+"-"+month+"-"+year);
	   YearTemp = year%100;
	   yearRem = YearTemp/4;
	  findingDayName = (day + resultant + monthTemp + YearTemp + yearRem )%7;  
		   for(int i=0;i<days.length;i++) {
			   if(findingDayName == i) {
				   System.out.println("The day of the week is: "+days[i]);   
	}
}
   }
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("ENTER THE YEAR: ");
	   year = scan.nextInt();
	   if(year>=1600 && year<=2399) {
		   if(year>=1600 && year<=1699 || year>=2000 && year<=2099) {
			   resultant = 6;
		   }
		   else if(year>=1700 && year<=1799 || year>=2100 && year<=2199) {
			   resultant = 4;
		   }
		   else if(year>=1800 && year<=1899 || year>=2200 && year<=2299) {
			   resultant = 2;
		   }
		   else if(year>=1900 && year<=1999 || year>=2300 && year<=2399) {
			   resultant = 0;
		   }
	   }
	   else {
		   System.out.println("INVALID INPUT");
		   System.exit(0);
	   }
	   
	   System.out.println("ENTER THE MONTH: ");
	   month = scan.nextInt();
	   if(month>=1 && month<=12) {
		   if(month==1 || month==10) {
			   monthTemp = 0;
		   }
		   else if(month==2 || month==3 || month==11) {
			   monthTemp = 3;
		   }
		   else if(month==4 || month==7) {
			   monthTemp = 6;
		   }
		   else if(month==5) {
			   monthTemp = 1;
		   }
		   else if(month==6) {
			   monthTemp = 4;
		   }
		   else if(month==8) {
			   monthTemp = 2;
		   }
		   else if(month==9 || month==12) {
			   monthTemp = 5;
		   }
	   }
	   else{
		   System.out.println("INVALID INPUT");
		   System.exit(0);
	   } 
	   System.out.println("ENTER THE DAY: ");
	   day = scan.nextInt();
	   if(day>=1 && day<=31) {
		   findTheDay();
	   }
	   else{
		   System.out.println("INVALID INPUT");
		   System.exit(0);
	   }
}
}