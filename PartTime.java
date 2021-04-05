public class PartTime{
public static void main(String []args){

int_WAGE_PER_HR=20;
int_ISFULLTIME=1;
int_ISPARTTIME=2;

int_fullTimeHr=8;
int_partTimeHr=4;

//CHECKS DAILYWAGE FOR FULLTIME AND PARTTIME
double empCheck = Math.floor(Math.random()*10) % 2;
int empHrs =8;
if(ISFULLTIME ==empCheck )
empHrs=8;
elif (ISPARTTIME ==empCheck)
 empHrs=4;
	
else
        empHrs=0;
	System.out.println(" Employee part time Wage is:"+Math.multiplyExact(empRatePerHr,empHrs));
   }
 }