package test2;

import java.util.Scanner;

public class test11_19 {

	public static void main(String[] args) {
		//a();
		student l=new student();
		l.name="����";
		l.setAge(1);
		l.getAge();
		l.weight=59;
		l.height=170;
		l.information();
		l.week();
		l.r_book();
		l.sleep();
		teacher b=new teacher();
		b.name="Ư��";
		b.age=18;
		b.sex="Ů";
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
        		System.out.println("������4����");
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
		System.out.println("������"+name+"\n���䣺"+age+"\n���أ�"+weight+"\n��ߣ�"+height);
	}
	public void week() {
		System.out.println("������ã�");
		
	}
	public void r_book() {
		System.out.println("����Ӵ��");
	}
	public void sleep() {
		System.out.println("����Ҫ���˯��");
	}
}
class teacher{
	String name;
	int age;
	String sex;
	public void information() {
		System.out.println("\n������"+name+"\n���䣺"+age+"\n�Ա�"+sex);
	}
	public void week1() {
		System.out.println("���ޱ��飡");
		
	}
	public void r_work() {
		System.out.println("���ܣ�");
	}
	public void g_home() {
		System.out.println("���ģ�");
	}
}
