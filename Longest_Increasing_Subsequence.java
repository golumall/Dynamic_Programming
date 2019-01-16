

//https://ide.geeksforgeeks.org/1QY5WPcAVX

import java.util.Scanner;
class LIS {
    static int getLargest(int a[],int n)
    {
        int b[]=new int[n];
        int res=1;
        b[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
              b[i]=b[i+1]+1;
            else
             b[i]=b[i+1];
        }
        
         for(int i=0;i<n;i++)
         {
             res=Math.max(res,b[i]);
         }
         return res;
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		System.out.println(getLargest(a,n));  
	}
}
