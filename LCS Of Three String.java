

//https://ide.geeksforgeeks.org/Dhk7dEOGsw

//Sources
//https://www.geeksforgeeks.org/lcs-longest-common-subsequence-three-strings/


import java.util.Scanner;

class Lcs_Three_String{
    static int getLcs(String s1,String s2,String s3)
    {
        int a[][][]=new int[s1.length()+1][s2.length()+1][s3.length()+1];
        for(int i=0;i<=s1.length();i++)
        {
            for(int j=0;j<=s2.length();j++)
            {
                for(int k=0;k<=s3.length();k++)
                {
                    if(i==0||j==0||k==0)
                    a[i][j][k]=0;
                    else if(s1.charAt(i-1)==s2.charAt(j-1)&&s1.charAt(i-1)==s3.charAt(k-1))
                    a[i][j][k]=a[i-1][j-1][k-1]+1;
                    else
                    a[i][j][k]=Math.max(Math.max(a[i-1][j][k],a[i][j-1][k]),a[i][j][k-1]);
                }
            }
        }
        return a[s1.length()][s2.length()][s3.length()];
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		System.out.println(getLcs(s1,s2,s3));
	}
}
