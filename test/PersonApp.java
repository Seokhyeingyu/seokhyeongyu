package test;

import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person persons [] = new Person [3];
		
		for (int i=0; i<3; i++) {
			Person person = new Person();
			System.out.println("�̸��� �����Դϱ�?");
			person.name = scanner.next();
			System.out.println("���̰� ��� �ǳ���?");
			person.age = scanner.nextInt();
			System.out.println("Ű�� ��� �ǳ���?");
			person.height = scanner.nextFloat();
			persons[i] = person;
		}
		
		for(int i=0; i <3; i++) {
			persons[i].printStates();
		}
	}
}