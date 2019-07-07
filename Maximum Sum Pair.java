//Sources
//https://www.geeksforgeeks.org/maximum-sum-pairs-specific-difference/

Q.:- 
     Given an array of integers and a number k. We can pair two number of array if difference between them is strictly less than k.
     The task is to find maximum possible sum of disjoint pairs. Sum of P pairs is sum of all 2P numbers of pairs.
     
Code:-

 
import java.util.*;

class MAximumPairSpecificSum{
    static int getValues(int a[],int k)
    {
        int sum=0;
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]-a[i-1]<k)
            {
                sum+=a[i];
                sum+=a[i-1];
                i--;
            }
        }
        return sum;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		int k=sc.nextInt();  
		 
		Arrays.sort(a);
		System.out.println(getValues(a,k));
	}
}
