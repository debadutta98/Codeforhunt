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
            int num=sc.nextInt();
            StringBuilder str=new StringBuilder();
            int count=0;
            if(num%2==0)
            {
                while(count<num)
                {
                    if(count==(num/2) || count==((num/2)-1))
                    {
                       str.append("0"); 
                    }
                    else
                    {
                        str.append("1");
                    }
                    count++;
                }
                System.out.println(str.toString());
            }
            else
            {
                while(count<num)
                {
                    if(count==(num/2))
                    {
                        str.append("1");
                    }
                    else
                    {
                        str.append("0");
                    }
                    count++;
                }
                System.out.println(str.toString());
            }
        }
	}
}
