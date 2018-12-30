

//https://ide.geeksforgeeks.org/Qb0Eljf1H3

import java.util.Scanner;

class Binomial_Coefficient {
    static int fact(int n)
    {
        int x=1;
        while(n>0)
        {
            x=x*n;
            n--;
        }
        return x;
    }
    static int getCoeficient(int n,int k)
    {
        return fact(n)/(fact(k)*fact(n-k)); 
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(getCoeficient(n,k));
		
	}
}
