package test1;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		while(1==1) {
			System.out.println("ÇëÊäÈëÒ»¸ö×ÖÄ¸");
			Scanner sc=new Scanner(System.in);
			String X=sc.nextLine();                        
			char c =X.charAt(0);
			if((c>='A' && c<='Z')||(c>='a' && c<='z'))
			{
				if(c>='A' && c<='Z') {c+=32;}
				else if(c>='a' && c<='z') {c-=32;}
				System.out.println(c);
			}
			else
			{System.out.println("ÊäÈë´íÎó£¡ÇëÊäÈëÒ»¸ö×ÖÄ¸");}
		}
			
	}
}
