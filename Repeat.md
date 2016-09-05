import java.util.Arrays;

public class Repeat {
	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		String sc=s.nextLine();*/
		String n1[]={"123","234","111","123","111"};
		String m="";
		Arrays.sort(n1);
		for(int i=0;i<n1.length-1;i++)
		{
			for(int j=i+1;j<n1.length;j++)
			{	
				if(n1[i].equals(n1[j]))
				{
						m=n1[j];
						System.out.println(m);
						
				}
				
			}
		}
		
	}
}
