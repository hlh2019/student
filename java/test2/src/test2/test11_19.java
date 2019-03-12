package test2;

import java.util.Scanner;

public class test11_19 {

	public static void main(String[] args) {
		//a();
		student l=new student();
		l.name="好巧";
		l.setAge(1);
		l.getAge();
		l.weight=59;
		l.height=170;
		l.information();
		l.week();
		l.r_book();
		l.sleep();
		teacher b=new teacher();
		b.name="漂亮";
		b.age=18;
		b.sex="女";
		b.information();
		b.week1();
		b.r_work();
		b.g_home();
		
		
	}
	/*public static void a() {
		// TODO Auto-generated method stub
        int [][] score1=new int[2][2];
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<2;i++) 
        {
        	for(j=0;j<2;j++) 
        	{
        		System.out.println("请输入4个数");
        		score1[i][j]=sc.nextInt();
        	}
        }
       for(i=0;i<2;i++) 
        {
        	for(j=0;j<2;j++) 
        	{
        	 System.out.println(score1[i][j]);
        	}
        }
	}*/

}
class student{
	String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int weight;
	int height;
	public void information() {
		System.out.println("姓名："+name+"\n年龄："+age+"\n体重："+weight+"\n身高："+height);
	}
	public void week() {
		System.out.println("天气真好！");
		
	}
	public void r_book() {
		System.out.println("好嗨哟！");
	}
	public void sleep() {
		System.out.println("今天要早点睡！");
	}
}
class teacher{
	String name;
	int age;
	String sex;
	public void information() {
		System.out.println("\n姓名："+name+"\n年龄："+age+"\n性别："+sex);
	}
	public void week1() {
		System.out.println("毫无表情！");
		
	}
	public void r_work() {
		System.out.println("难受！");
	}
	public void g_home() {
		System.out.println("开心！");
	}
}
