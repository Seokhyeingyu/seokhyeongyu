package test;

import java.util.Scanner;

public class ShopApp {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		Shop arr[] = new Shop[3];
		
		for(int i=0; i<arr.length; i++) {
			Shop shop = new Shop();
			
			System.out.print("이름: ");
			shop.setName(scanner.next());
			System.out.print("폰가격: ");
			shop.setPhone(scanner.nextInt());
			System.out.print("tv가격: ");
			shop.setTv(scanner.nextInt());
			System.out.print("컴퓨터가격: ");
			shop.setComputer(scanner.nextInt());
			
			
			shop.sum();
			arr[i] = shop;
		}
		for(int i=0; i<arr.length; i++) {
			arr[i].printStates();
		}
	}
}

