import java.util.Arrays;
import java.util.Scanner;

public class index 
{
  public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		Arrays.sort(ar);
		for(int i=0;i<n;i++)
		{
			if(i==ar[i])
				System.out.println(ar[i]);
		}
		sc.close();
	}

}
		
