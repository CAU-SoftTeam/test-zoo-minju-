package test;
import java.util.Scanner;
public class Rabbit extends Animal {

	@Override
	void prey() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�䳢�� ����: ");
		this.age=scan.nextInt();
		System.out.println("�䳢�� ����: ");
		scan.nextLine();
		this.sex=scan.nextLine().charAt(0);
		
		if(this.sex=='f')
			System.out.println("���� �߷�: "+this.age*2+"g");
		if(this.sex=='m')
			System.out.println("���� �߷�: "+this.age*3+"g");
	}

	@Override
	void clean() {
		// TODO Auto-generated method stub
		System.out.println("�䳢�� �� �޿� �� �� �ı⼼��.");
	}

}
