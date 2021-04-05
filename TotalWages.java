public class TotalWages
{
      public static void main (String[] args)
  {

        int_WAGE_PER_HR=20;
        int_ISFULLTIME=1;
        int_ISPARTTIME=2;
        int_WORKINGDAYS=20;

          //VARIABLE
           int_totalSalary=0;

//CHECKS DAILYWAGE FOR FULLTIME AND PARTTIME USING CASE
           for ( day=1; day<=WORKINGDAYS; day++ )
           
  double empCheck = Math.floor(Math.random()*10) % 3;
      int EmpHrs=0;
	switch(empCheck){

	case1: empHrs=8;
                 break;
		
		case2: empHrs=4;
		break;
               
		case3: empHrs=0;

		break;
	
        salary=empHrs*WAGE_PER_HR;	
        totalSalary=totalSalary+salary;

System.out.println( "Total salary of an employee in month is :"+ Math.multiplyExact(empRatePerHr,empHrs));
      }
}
