/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0)
	    {
	        int  arr[]=new int [6];
	        int i=0;
	        while(i<6)
	        {
	            arr[i++]=sc.nextInt();
	        }
	            if((arr[0]==arr[2] && arr[1]==arr[3]) || (arr[0]==arr[3] && arr[1]==arr[2]))
	            {
	                System.out.println(1);
	            }
    	        else if((arr[0]==arr[4] && arr[1]==arr[5])|| (arr[0]==arr[5] && arr[1]==arr[4]))
    	        {
    	            System.out.println(2);
    	        }
    	        else
    	        {
    	            System.out.println(0);
    	        }
	    }
	}
}
