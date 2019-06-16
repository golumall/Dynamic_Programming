
//Sources
//https://www.geeksforgeeks.org/maximum-sum-increasing-subsequence-dp-14/
//https://ide.geeksforgeeks.org/LKpArOmAcs

import java.util.*;

class MaximumSumIncreasing{
    static int getMaxSum(int a[],int n)
    {
        int m[]=new int[n];
         for(int i=0;i<n;i++)
           m[i]=a[i];
         for(int i=1;i<n;i++)
         {
             for(int j=0;j<i;j++)
             {
                 if(a[i]>a[j]&&m[i]<m[j]+a[i])
                    m[i]=m[j]+a[i];
                 
             }
         }
         int max=0;
         for(int i=0;i<n;i++)
           {
               if(max<m[i])
                 max=m[i];
           }
           return max;
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	  System.out.println(getMaxSum(a,n));
	}
}
