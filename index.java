import java.util.*;
public class Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int[]m=new int[n];
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(m[i]==i)
		{
			System.out.print(m[i]+" ");
		}
		}
		}
		
