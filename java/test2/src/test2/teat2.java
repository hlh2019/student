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
		System.out.println("��ӭ��������ϵͳ��");
		System.out.println("�����������˺�:");
		id=sc.nextInt();
		System.out.println("��������������:");
		name=sc.next();
		System.out.println("��������������:");
		password=sc.nextInt();
	}
	public void select() {
		for(;;){
		System.out.println("��ѡ������Ҫ�Ĳ�����\n"+"1�����\n"+"2��ȡ��\n"
	+"3���鿴���\n"+"4���˳�");
		n=sc.nextInt();
		if(n==1) {
			System.out.println("�������");
			m=sc.nextInt();
			System.out.println("���ɹ��������Ϊ��"+m+"\t��ǰ���Ϊ��"+(m+balance));
			balance=(m+balance);
			continue;
		}
		else if(n==2) {
			System.out.println("����ȡ���");
			j=sc.nextInt();
			if(j>balance) {
				System.out.println("���㣬�����������");
			}
			else {
			System.out.println("ȡ��ɹ���ȡ����Ϊ��"+j+"��ǰ���Ϊ��"+(balance-j));
			}
		    balance=(balance-j);
		    continue;
		}
		else if(n==3) {
			System.out.println("�������Ϊ��"+balance);
			continue;
		}
		else {
			System.out.println("�ټ���ף��������죡");
		}
		break;
		}
	}
}
class Bank{
	String bankname="��ʿ����";
	String street="�ȷ���";
	public void bank() {
		System.out.println("�������ƣ�"+bankname+"\n�ֵ���"+street);
	}
}
	
