package java;

import java.util.Scanner;

public class test11_13 {

	public static void main(String[] args) {
		int i;
		int t=0;
		int [] Number=new int[10];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++) 
		{
			System.out.println("ÇëÊäÈë"+(i+1)+"¸öÊý");
			Number[i]=sc.nextInt();
		}
		
		for(i=0;i<10;i++) {
			for(int j=i+1; j<10; j++)
			{
			if(Number[i]<Number[j]) 
			{
				t=Number[i];
				Number[i]=Number[j];
				Number[j]=t;
			}
			}
		}
		for(i=0;i<10;i++) {
		System.out.println(Number[i]);
		}

	}

}
