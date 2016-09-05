import java.util.*;
public class Least 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		int arr[]=new int[len];
		int num=Integer.parseInt(s);
		int k=sc.nextInt();
		int i=0,n;
		while(num>0)
		{
			n=num%10;
			num/=10;
			arr[i]=n;
			i++;
		}
			Arrays.sort(arr);
			for(int j=0;j<len-k;j++)
			{
				System.out.print(arr[j]);
			}
			
		sc.close();
	}

}
