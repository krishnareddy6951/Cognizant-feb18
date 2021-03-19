/**
 * Name:Tenali Venkata Krishna Reddy
 * Description:Lab1 Exercise:generate the mirror image of a string and it to the existing string
 * Date:17/3/2021
 */

import java.util.Scanner;
public class MirrorOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getImage(str));
	    
	}
    private static String getImage(String pStr)
    {
    	//String reverseStr="";
    	//for(int i=pStr.length()-1;i>=0;i--)
    		//reverseStr+=pStr.charAt(i);
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
	}

}
