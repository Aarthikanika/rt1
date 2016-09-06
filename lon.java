package gv;

import java.util.Arrays;

public class Con1 extends Pangram {
	public static void main(String[] args) {
		int n[]={1,3,2,4};
		Arrays.sort(n);
		String m="";
		String m1="";
		
		for(int i=0;i<n.length;i++)
		{
			m+=n[i];
		}
    StringBuffer sb=new StringBuffer(m);
    System.out.println(sb.reverse());

	}

}
