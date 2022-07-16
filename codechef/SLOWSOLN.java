/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long findMaxIteration(int T,int N,int sumN)
    {
        int count=0;
        long sum=0;
        while(sumN>0)
        {
            if((sumN-N)>0)
            {
                sum+=((long)N*(long)N);
                sumN-=N;
            }
            else
            {
                sum+=((long)sumN*(long)sumN);
                sumN=0;
            }
            count++;
        }
        if(count<=T)
        {
            return sum;
        }
        else
        {
            return (long)((long)T*(long)((long)N*(long)N));
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int maxT=sc.nextInt(),
		        maxN=sc.nextInt(),
		        sumN=sc.nextInt();
		        System.out.println(findMaxIteration(maxT,maxN,sumN));
		}
	}
}