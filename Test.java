package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean animal;
		boolean which;
		Tiger tiger=new Tiger();
		Rabbit rabbit=new Rabbit();
		System.out.println("������ �߾ӵ��������� �䳢�� ȣ���̰� �ֽ��ϴ�. �䳢�� ���� ������ �ñ��Ͻôٸ� false, ȣ���̿� ���� ������ �ñ��Ͻôٸ� true�� �����ּ���.");
		Scanner scan=new Scanner(System.in);
		animal=scan.nextBoolean();
		if(animal) {
			System.out.println("ȣ������ ���̰� �ñ��ϴٸ� false, �ıⰡ �ñ��ϴٸ� true�� �����ּ���.");
			which=scan.nextBoolean();
			if(which)
				tiger.clean();
			else
				tiger.prey();
		}
		else {
			System.out.println("�䳢�� ���̰� �ñ��ϴٸ� false, �ıⰡ �ñ��ϴٸ� true�� �����ּ���.");
			which=scan.nextBoolean();
			if(which)
				rabbit.clean();
			else
				rabbit.prey();
		}
		
	}

}
