

import java.util.Scanner;

class Coin_Change_Problem {
    static int coinChange(int s[],int m,int n)
    {
       int x[]=new int[n+1];
       for(int i=0;i<n+1;i++)
            x[i]=0;
         x[0]=1;
      for(int i=0;i<m;i++)
      {
          for(int j=s[i];j<=n;j++)
          {
              x[j]+=x[j-s[i]];
          }
          
      }
      return x[n];
       
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int s[]=new int[m];
		for(int i=0;i<m;i++)
		{
		    s[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		
		System.out.println(coinChange(s,m,n));
	}
}
