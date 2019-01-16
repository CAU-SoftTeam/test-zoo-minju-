package test;
import java.util.Scanner;
public class Rabbit extends Animal {

	@Override
	void prey() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("토끼의 나이: ");
		this.age=scan.nextInt();
		System.out.println("토끼의 성별: ");
		scan.nextLine();
		this.sex=scan.nextLine().charAt(0);
		
		if(this.sex=='f')
			System.out.println("먹이 중량: "+this.age*2+"g");
		if(this.sex=='m')
			System.out.println("먹이 중량: "+this.age*3+"g");
	}

	@Override
	void clean() {
		// TODO Auto-generated method stub
		System.out.println("토끼는 한 달에 한 번 씻기세요.");
	}

}
