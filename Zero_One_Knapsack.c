#include<stdio.h>
int max(int a,int b)
{
	return (a>b?a:b);
}
int knapsack(int wt[],int val[],int W,int n)
{
	if(n==0||W==0)
		return 0;
	if(wt[n-1]>W)
		return knapsack(wt,val,W,n-1);
	else
		return max(val[n-1]+knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1));
}
int main()
{
int n,W;
//Number of items
scanf("%d",&n);
int wt[n],val[n];
//Weight of every items
for(int i=0;i<n;i++)
 scanf("%d",&wt[i]);
//VAlue of every items
 for(int i=0;i<n;i++)
 scanf("%d",&val[i]);
//Capacity of Knapsack
 scanf("%d",&W);
 printf("%d",knapsack(wt,val,W,n));

	return 0;
}
