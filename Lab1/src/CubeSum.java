/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:Sum of Cubes of Digits of a number
 * Date:14/3/2021
 */
import java.util.*;
public class CubeSum {
	Scanner sc=new Scanner(System.in);
	public static int cubeSum(int n)
	{
	  int remainder=0,sum=0;
	  while(n>0)
	  {
		  remainder=n%10;
		  sum+=remainder*remainder*remainder;
		  n/=10;
	  }
	  return sum;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int result=cubeSum(number);
		System.out.println(result);
	}


		

	}


