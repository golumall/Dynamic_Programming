

//https://ide.geeksforgeeks.org/38hxDu1prU


import java.util.Scanner;

class Newman_Conway{
    static void getSequence(int n)
    {
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=a[2]=1;
        System.out.print(a[1]+" "+a[2]+" ");
        for(int i=3;i<=n;i++)
           {
               a[i]=a[a[i-1]]+a[i-a[i-1]];
               System.out.print(a[i]+" ");
           }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		getSequence(n);
	}
}
