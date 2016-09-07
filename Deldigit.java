import java.util.Arrays;
import java.util.Scanner;


public class Strr
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 int len=s.length();
	 int k=sc.nextInt();
	 int j[]=new int[len];
	 int i;
	 for( i=0;i<s.length();i++)
	{
		 j[i]=Character.digit(s.charAt(i), 10);
	}	 
		 Arrays.sort(j);
			for(int m=0;m<len-k;m++)
			{
				System.out.print(j[m]);
			}
	}
 
 }
