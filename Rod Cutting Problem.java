

//Sources
//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/

//https://ide.geeksforgeeks.org/o4OktJdxtK


import java.util.Scanner;


class Cutting_Rod {
    static int getMaxValue(int a[],int n)
    {
        
        int b[]=new int[n+1];
        b[0]=0;
        for(int i=1;i<=n;i++)
        {
            int maxValue=Integer.MIN_VALUE;
            for(int j=0;j<i;j++)
            {
                maxValue=Math.max(maxValue,a[j]+b[i-j-1]);
                
            }
            b[i]=maxValue;
        }
        return b[n];
     }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	System.out.println(getMaxValue(a,n));
	}
}
