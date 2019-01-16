package test;

import java.util.Scanner;

public class Tiger extends Animal {

	@Override
	void prey() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("호랑이의 나이: ");
		this.age=scan.nextInt();
		scan.nextLine();
		System.out.println("호랑이의 성별: ");
		
		this.sex=scan.nextLine().charAt(0);
		
		if(this.sex=='f')
			System.out.println("먹이 중량: "+this.age*3+"kg");
		if(this.sex=='m')
			System.out.println("먹이 중량: "+this.age*3.5+"kg");

	}

	@Override
	void clean() {
		// TODO Auto-generated method stub
		System.out.println("호랑이는 이주일에 한 번 씻겨주세요");

	}

}
