package test;
import java.util.Scanner;

public class PlayerApp {
	public static void main (String[] arge) {
		Scanner scanner=new Scanner(System.in);
		Player players[] = new Player[3];
		
		for(int i=0; i<players.length; i++) {
			Player player = new Player();
			
			System.out.println("이름: ");
			player.setName(scanner.next());
			
			System.out.println("기록: ");
			player.srtRecord(scanner.nextInt());
			
			players[i]=player;
		}
		for(int i=0; i<players.length; i++) {
			players[i].showRecord();
		}
		Player ranking [] = new Player[3]; 
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
			} else {
				ranking[0] = players[2];
			}
		} else {
			if(players[1].getRecord() < players[2].getRecord()) {
				ranking[0] = players[1];
			} else {
				ranking[0] = players[2];
			}
		
		}
		System.out.println("1등은" + ranking[0].getName());
		
	}
}
/**
 System.out.println(players[0].getName()+"이"+players[1].getName()+"보다 빠르다.");
 * */
