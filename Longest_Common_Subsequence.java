import java.util.Scanner;
import java.io.*;
class Lcs2
{
	public static int lcsofString(char []str1,char []str2,int len1,int len2)
	{
         if(len1==str1.length||len2==str2.length)
         	return 0;
         if(str1[len1]==str2[len2])
         	return 1+lcsofString(str1,str2,len1+1,len2+1);
         else
         	return Math.max(lcsofString(str1,str2,len1+1,len2),lcsofString(str1,str2,len1,len2+1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
	System.out.println(lcsofString(str1.toCharArray(),str2.toCharArray(),0,0));
	}
}
