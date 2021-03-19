/*Name:Tenali Venkata Krishna Reddy
 * Description:To find Duration Difference between given date and current date
 * Date:16/03/2021
 */
import java.time.LocalDate;
import java.time.Period;
public class DurationDifference {
	 static void durationDifference(LocalDate start_date,LocalDate end_date) 
	    { 

	        Period difference = Period .between(start_date, end_date); 

	        System.out.print( "Difference "+ "between two dates is: "); 


	        System.out.printf( "%d years, %d months,  and %d days ", difference.getYears(), difference.getMonths(), difference.getDays()); 
	    } 




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    LocalDate start_date = LocalDate.of(2018, 01, 10); 


        LocalDate end_date  = java.time.LocalDate.now();

        durationDifference(start_date, end_date); 
	}

}