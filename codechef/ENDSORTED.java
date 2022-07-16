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
	        int len=sc.nextInt();
	        int i=0;
	        int arr[]=new int[len];
	        while(len-->0)
	        {
	            arr[i++]=sc.nextInt();
	        }
	        int result=0;
	        if(arr[0]==1 && arr[arr.length-1]==arr.length)
	        {
	            System.out.println(0);
	        }
	        else
	        {
	            int end=0;
	            if(arr[arr.length-1]!=arr.length)
	            {
	                for(int j=0;j<arr.length;j++)
	                {
	                    if(arr[j]==arr.length)
	                    {
	                        end=j;
	                        break;
	                    }
	                }
	                for(int j=end+1;j<arr.length;j++)
	                {
	                    if(arr[j-1]>arr[j])
	                    {
	                        int temp=arr[j-1];
	                        arr[j-1]=arr[j];
	                        arr[j]=temp;
	                        result++;
	                    }
	                }
	            }
	                for(int j=0;j<arr.length;j++)
	                {
	                    if(arr[j]==1)
	                    {
	                        break;
	                    }
	                    else
	                    {
	                        result++;
	                    }
	                }
	                System.out.println(result);
	        }
	    }
	}
}
