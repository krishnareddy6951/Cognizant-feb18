/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:testing if an array contains specific value
 * Date:15/3/2021
 */
import java.util.Scanner;
public class CheckingSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		//to take user input of length of an array
		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();
		
		//to take user input of elements of array
		System.out.print("Enter the elements of array(seperated by space):");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	  //user input for specific value that is to be checked
	  System.out.print("Enter the value to be checked:");
      int valueToCheck=sc.nextInt();
      
      //checking if specific value is present in an array
      boolean status = false;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==valueToCheck)
    	  {
    		  status=true;
    		  break;
    	  }
      }
      if(status==true)
    	  System.out.printf("yes the value %d is present in array",valueToCheck);
      else
    	  System.out.printf("No  the value %d is not present in array",valueToCheck); 
	}




	}


