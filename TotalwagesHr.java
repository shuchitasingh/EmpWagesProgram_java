public class TotalWagesHr{
   
public static void main(String[] args) {
        int WAGE_PER_HR=20;
        int ISFULLTIME=1;
        int ISPARTTIME=2;
        int WORKINGDAYS=20;
        int WORK_HR_IN_MONTH=100;
        int totalEmpHr=100;
        int totalWorkingDays=20;


while (totalEmpHr < WORK_HR_IN_MONTH && totalWorkingDays < WORKINGDAYS ){
               totalWorkingDays++;
                int empCheck = (int)Math.floor(Math.random()*10) % 3;
               
	             int empHrs=0;
  
	switch (empCheck) {

	                    case 1: empHrs=8;
	                            break;
	              
		                case 2:   empHrs=4;
	                              break;
		
		                case 3 :   empHrs=0;
	                               break;
        
	}
	totalEmpHr=totalEmpHr+empHrs;
}
       int totalSalary=totalEmpHr*WAGE_PER_HR;

System.out.println("Total Salary will be:"+ totalSalary);
        }

	}
