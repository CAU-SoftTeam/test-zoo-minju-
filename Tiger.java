package test;

import java.util.Scanner;

public class Tiger extends Animal {

	@Override
	void prey() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ȣ������ ����: ");
		this.age=scan.nextInt();
		scan.nextLine();
		System.out.println("ȣ������ ����: ");
		
		this.sex=scan.nextLine().charAt(0);
		
		if(this.sex=='f')
			System.out.println("���� �߷�: "+this.age*3+"kg");
		if(this.sex=='m')
			System.out.println("���� �߷�: "+this.age*3.5+"kg");

	}

	@Override
	void clean() {
		// TODO Auto-generated method stub
		System.out.println("ȣ���̴� �����Ͽ� �� �� �İ��ּ���");

	}

}
