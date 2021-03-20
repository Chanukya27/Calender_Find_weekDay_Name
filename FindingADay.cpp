#include<stdio.h>
#include<string.h>

int WEEK = 7;
const int MONTH = 12;
int resultant =0;
int findingDayName;
int year,month,day;
char days[][20] ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int monthTemp,yearRemainder;

void findTheDay(){
	printf("\nYou have entered the date formate is: ***DD MM YYYY***\n");
	printf("\nYou have entered the date formate is: %d-%d-%d" ,day,month,year);
	int yearTemp = year%100;
	yearRemainder = yearTemp/4;
	findingDayName =(( day + resultant + monthTemp+yearTemp +yearRemainder )%7);
	for(int i=0;i<WEEK;i++) {
			   if(findingDayName == i) {
			   	printf("\nThe day of the week is:%s ",days[i]);
		}
	}
}
main(){
	printf("\nENTER THE YEAR: \n");
	scanf("%d",&year);
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
		   printf("\nINVALID INPUT");  
	   }
	printf("\nENTER THE MONTH: \n");
	scanf("%d",&month);
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
		   printf("\nINVALID INPUT");
	}
	printf("\nENTER THE DAY: \n");
	scanf("%d",&day);
	if(day>=1 && day<=31) {
		   findTheDay();
	   }
	   else{
		   printf("\nINVALID INPUT");
		   
	   }
}












