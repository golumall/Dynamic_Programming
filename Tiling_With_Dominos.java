

//https://ide.geeksforgeeks.org/ij5nctI5qv

//Sources
//https://www.geeksforgeeks.org/tiling-with-dominoes/


import java.util.Scanner;

class Tiling_With_Dominos {
static int getValue(int n)
{
    int a[]=new int[n+1];
    int b[]=new int[n+1];
    a[0]=1;a[1]=0;b[0]=0;b[1]=1;
    for(int i=2;i<=n;i++)
    {
        a[i]=a[i-2]+2*b[i-1];
        b[i]=a[i-1]+b[i-2];
    }
    return a[n];
}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getValue(n));
	}
}
