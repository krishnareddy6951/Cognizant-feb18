/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:Differenec between sum of squares of n natural numbers and square of the sum
 * Date:14/3/2021
 */
import java.util.Scanner;
public class CalculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(range));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfN=0,sumOfSquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfSquares;
    	return sum;
	}

}
