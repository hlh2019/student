package test1;

import java.util.Calendar;
import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		int y1,m,d,m1,d1;
		Calendar cal=Calendar.getInstance();
		m=cal.get(Calendar.MONTH)+1;
		d=cal.get(Calendar.DATE);
		xz(m,d);

		System.out.println("���������ĳ���������");
		Scanner sd=new Scanner(System.in);
		y1=sd.nextInt();
		m1=sd.nextInt();
		d1=sd.nextInt();
		xz(m1,d1);
	}
	public static void xz(int m,int d) 
	{
		
		if((m==1 && d>=21 && d<32)||(m==2 && d>=1 && d<20))
		{
			System.out.println("ˮƽ�����ƣ�����˳��");
		}
		if((m==2 && d>=20 && d<30)||(m==3 && d>=1 && d<21))
		{
			System.out.println("˫���������ƣ���������");
		}
		if((m==3 && d>=21 && d<32)||(m==4 && d>=1 && d<21))
		{
			System.out.println("���������ƣ�һ����˳");
		}
		if((m==4 && d>=21 && d<31)||(m==5 && d>=1 && d<22))
		{
			System.out.println("��ţ�����ƣ����˹���");
		}
		if((m==5 && d>=22 && d<32)||(m==6 && d>=1 && d<22))
		{
			System.out.println("˫�������ƣ����尲��");
		}
		if((m==6 && d>=22 && d<31)||(m==7 && d>=1 && d<23))
		{
			System.out.println("��з�����ƣ��ļ�����");
		}
		if((m==7 && d>=23 && d<32)||(m==8 && d>=1 && d<24))
		{
			System.out.println("ʨ�������ƣ���ȷ��");
		}
		if((m==8 && d>=24 && d<32)||(m==9 && d>=1 && d<24))
		{
			System.out.println("��Ů�����ƣ��һ���");
		}
		if((m==9 && d>=24 && d<31)||(m==10 && d>=1 && d<24))
		{
			System.out.println("��������ƣ���������");
		}
		if((m==10 && d>=24 && d<32)||(m==11 && d>=1 && d<23))
		{
			System.out.println("��Ы�����ƣ�����");
		}
		if((m==11 && d>=23 && d<31)||(m==12 && d>=1 && d<22))
		{
			System.out.println("���������ƣ�����");
		}
		if((m==12 && d>=22 && d<32)||(m==1 && d>=1 && d<21))
		{
			System.out.println("Ħ�������ƣ�����");
		}
		 
	}
	
	
	
	
	
	

}
