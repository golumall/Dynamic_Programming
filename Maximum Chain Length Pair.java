//Sources
//https://www.geeksforgeeks.org/maximum-length-chain-of-pairs-dp-20/

import java.util.*;

class GFG {
    static int getMaxLength(int a[][])
    {
        int n=a.length;
        //return n;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j][0]<a[i][0])
                {
                    int temp=a[j][0];
                    a[j][0]=a[i][0];
                    a[i][0]=temp;
                    temp=a[j][1];
                    a[j][1]=a[i][1];
                    a[i][1]=temp;
                }
            }
        }
        
        int lis[]=new int[n];
        for(int i=0;i<n;i++)
          lis[i]=1;
       for(int i=1;i<n;i++)
       {
           for(int j=0;j<i;j++)
           {
               if(a[i][0]>a[j][1]&&lis[i]<lis[j]+1)
                 lis[i]=lis[j]+1;
           }
       }
       int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<lis[i])
            max=lis[i];
        }
       
        return max;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mat[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
		    mat[i][0]=sc.nextInt();
		    mat[i][1]=sc.nextInt();
		}
		System.out.println(getMaxLength(mat));
	}
}
