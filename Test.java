package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean animal;
		boolean which;
		Tiger tiger=new Tiger();
		Rabbit rabbit=new Rabbit();
		System.out.println("영세한 중앙동물원에는 토끼와 호랑이가 있습니다. 토끼에 대한 정보가 궁금하시다면 false, 호랑이에 대한 정보가 궁금하시다면 true를 눌러주세요.");
		Scanner scan=new Scanner(System.in);
		animal=scan.nextBoolean();
		if(animal) {
			System.out.println("호랑이의 먹이가 궁금하다면 false, 씻기가 궁금하다면 true를 눌러주세요.");
			which=scan.nextBoolean();
			if(which)
				tiger.clean();
			else
				tiger.prey();
		}
		else {
			System.out.println("토끼의 먹이가 궁금하다면 false, 씻기가 궁금하다면 true를 눌러주세요.");
			which=scan.nextBoolean();
			if(which)
				rabbit.clean();
			else
				rabbit.prey();
		}
		
	}

}
