

//https://ide.geeksforgeeks.org/OWiMu4W9Te

//Sources
//https://www.geeksforgeeks.org/golomb-sequence/


import java.util.Scanner;

class GFG {
    static void printGolombSequence(int n)
    {
        int a[]=new int[n+1];
        a[1]=1;
        System.out.print(a[1]+" ");
        for(int i=2;i<=n;i++)
        {
            a[i]=1+a[i-a[a[i-1]]];
            System.out.print(a[i]+" ");
        }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printGolombSequence(n);
	}
}
