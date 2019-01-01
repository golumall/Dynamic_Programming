
//Sources
//https://www.geeksforgeeks.org/newman-shanks-williams-prime/

//https://ide.geeksforgeeks.org/HB4nBgxDxY


import java.util.Scanner;

class Newman_Shanks {
    static int getValue(int n)
    {
        int a[]=new int[n+1];
        a[0]=1;a[1]=1;
        for(int i=2;i<=n;i++)
        {
            a[i]=2*a[i-1]+a[i-2];
        }
        return a[n];
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getValue(n));
	}
}
