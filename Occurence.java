//input aaaaabbbbcccdef

import java.util.Scanner;

public class Occurence{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String str="";
		char[] ch = s.toCharArray();
		int count = 1;
		for(int i=0;i<ch.length;i++){
			count=1;
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				count = count+1;
				ch[j]=' ';
			}
		}
		if(ch[i]!=' '){
		if(count>1){
			str+=ch[i]+""+count;
			
		}
		else
			str+=ch[i]+"";
		
		}
		}
		System.out.println(str);
	}
}
