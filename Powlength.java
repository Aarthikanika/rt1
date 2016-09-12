import java.util.Scanner;

public class Powlength {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();int sum=0;
		int len=String.valueOf(num).length();
		int[] re=new int[len];
		
        for(int i = 0; i < len; i++) 
        {
         int j = Character.digit(String.valueOf(num).charAt(i), 10);
         re[i]=j; 
        }

        for(int i=0;i<len-1;i++)
        	sum+=(int)Math.pow(re[i], re[i+1]);
        System.out.println(sum+1);
        sc.close();
	}
}
