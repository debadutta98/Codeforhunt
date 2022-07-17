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
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    while(N-->0)
		    {
		        int num=sc.nextInt();
		        if((K-num)>=0)
		        {
		            System.out.print(1);
		            K-=num;
		        }
		        else
		        {
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		}
	}
}
