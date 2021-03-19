/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:prime numbers upto that integer
 * Date:14/3/2021
 */
import java.util.*;
public class PrimeNumbers {
	public static void prime(int n)
	{
		int count=0;
		if(n==1)
		      System.out.println("No prime numbers");
			else
			{
				for(int i=2;i<=n;i++)
				{
				   count=0;
				   for(int j=2;j<=i/2;j++)
				   {
					   if(i%j==0)
					   {
						   count++;
						   break;
					   }
				   }
				   if(count==0)
					   System.out.print(i+" ");
				}
			}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		prime(number);

	}



	}


