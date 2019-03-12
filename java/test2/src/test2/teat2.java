package test2;

import java.util.Scanner;

public class teat2 {

	public static void main(String[] args) {
		Bank B=new Bank();
		B.bank();
		User U=new User(); 
		 U.user();
		 U.select();
	}

}

class User{
	int id;
	String name;
	private int password;
	static double balance=0;
	int n=0;
	int m=0,j=0;
	Scanner sc=new Scanner(System.in);
	public int getpassword() {
		return password;
	}
	public void setpassword(int password) {
		this.password = password;
	}
	public void user() {
		System.out.println("欢迎登入银行系统！");
		System.out.println("请输入您的账号:");
		id=sc.nextInt();
		System.out.println("请输入您的姓名:");
		name=sc.next();
		System.out.println("请输入您的密码:");
		password=sc.nextInt();
	}
	public void select() {
		for(;;){
		System.out.println("请选择您需要的操作：\n"+"1、存款\n"+"2、取款\n"
	+"3、查看余额\n"+"4、退出");
		n=sc.nextInt();
		if(n==1) {
			System.out.println("输入存款金额！");
			m=sc.nextInt();
			System.out.println("存款成功！存款金额为："+m+"\t当前余额为："+(m+balance));
			balance=(m+balance);
			continue;
		}
		else if(n==2) {
			System.out.println("输入取款金额！");
			j=sc.nextInt();
			if(j>balance) {
				System.out.println("余额不足，请重新输入金额！");
			}
			else {
			System.out.println("取款成功！取款金额为："+j+"当前余额为："+(balance-j));
			}
		    balance=(balance-j);
		    continue;
		}
		else if(n==3) {
			System.out.println("您的余额为："+balance);
			continue;
		}
		else {
			System.out.println("再见，祝您生活愉快！");
		}
		break;
		}
	}
}
class Bank{
	String bankname="瑞士银行";
	String street="先锋大街";
	public void bank() {
		System.out.println("银行名称："+bankname+"\n街道："+street);
	}
}
	
