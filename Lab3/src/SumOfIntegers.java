/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:program that readsa line of integers and then displays each integer and the sum of all integers
 * Date:18/3/2021
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		int sum=0;
		String [] strArr=new String[NUM_ITEMS];
		System.out.println("Enter the value of the items ");
		for(int i=0;i<strArr.length;i++)
			strArr[i]=sc.next();
         for(int i=0;i<strArr.length;i++)
         {
        	 sum+=(Integer.parseInt(strArr[i]));
         }
		System.out.println("the sum is"+sum);

	}

}
