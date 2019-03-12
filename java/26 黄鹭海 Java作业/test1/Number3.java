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

		System.out.println("请输入您的出生年月日");
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
			System.out.println("水平座运势，事事顺心");
		}
		if((m==2 && d>=20 && d<30)||(m==3 && d>=1 && d<21))
		{
			System.out.println("双鱼座座运势，万事如意");
		}
		if((m==3 && d>=21 && d<32)||(m==4 && d>=1 && d<21))
		{
			System.out.println("白羊座运势，一帆风顺");
		}
		if((m==4 && d>=21 && d<31)||(m==5 && d>=1 && d<22))
		{
			System.out.println("金牛座运势，财运滚滚");
		}
		if((m==5 && d>=22 && d<32)||(m==6 && d>=1 && d<22))
		{
			System.out.println("双子座运势，身体安康");
		}
		if((m==6 && d>=22 && d<31)||(m==7 && d>=1 && d<23))
		{
			System.out.println("巨蟹座运势，四季安康");
		}
		if((m==7 && d>=23 && d<32)||(m==8 && d>=1 && d<24))
		{
			System.out.println("狮子座运势，五谷丰登");
		}
		if((m==8 && d>=24 && d<32)||(m==9 && d>=1 && d<24))
		{
			System.out.println("处女座运势，桃花运");
		}
		if((m==9 && d>=24 && d<31)||(m==10 && d>=1 && d<24))
		{
			System.out.println("天秤座运势，和气生财");
		}
		if((m==10 && d>=24 && d<32)||(m==11 && d>=1 && d<23))
		{
			System.out.println("天蝎座运势，随便吧");
		}
		if((m==11 && d>=23 && d<31)||(m==12 && d>=1 && d<22))
		{
			System.out.println("射手座运势，都行");
		}
		if((m==12 && d>=22 && d<32)||(m==1 && d>=1 && d<21))
		{
			System.out.println("摩羯座运势，词穷");
		}
		 
	}
	
	
	
	
	
	

}
