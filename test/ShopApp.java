package test;

import java.util.Scanner;

public class ShopApp {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		Shop arr[] = new Shop[3];
		
		for(int i=0; i<arr.length; i++) {
			Shop shop = new Shop();
			
			System.out.print("�̸�: ");
			shop.setName(scanner.next());
			System.out.print("������: ");
			shop.setPhone(scanner.nextInt());
			System.out.print("tv����: ");
			shop.setTv(scanner.nextInt());
			System.out.print("��ǻ�Ͱ���: ");
			shop.setComputer(scanner.nextInt());
			
			
			shop.sum();
			arr[i] = shop;
		}
		for(int i=0; i<arr.length; i++) {
			arr[i].printStates();
		}
	}
}

