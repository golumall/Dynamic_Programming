

import java.util.*;

class Maximum_Path_Average{
    static double getMaxAverage(int mat[][],int n,int m)
    {
       // int n=mat.length;
        //int m=mat[0].length;
        int dp[][]=new int[n+1][m+1];
        dp[0][0]=mat[0][0];
        for(int i=1;i<n;i++)
          dp[i][0]=dp[i-1][0]+mat[i][0];
        for(int i=1;i<m;i++)
          dp[0][i]=dp[0][i-1]+mat[0][i];
         for(int i=1;i<n;i++)
         {
             for(int j=1;j<m;j++)
             {
                 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+mat[i][j];
             }
         }
          return (double)dp[n-1][m-1]/(n*m-1);
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		System.out.println(getMaxAverage(mat,n,m));
	}
}
