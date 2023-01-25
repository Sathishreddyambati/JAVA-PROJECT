package project;
import java.util.Scanner;
public class Main extends Player1 {
	public static void main(String[] args) {
		Player1 player = new Player1();
		Player2 betterPlayer = new Player2();
		System.out.println("Enter Player1 name");
		Scanner sc = new Scanner(System.in);
		player.name = sc.nextLine();
		System.out.println("Enter Player2 name");
		betterPlayer.name = sc.nextLine();
		System.out.println(betterPlayer.name + ", Do you want armour(true, false)");					//armour of player2
		betterPlayer.armour = sc.nextBoolean();
		do {
			System.out.println(player.name + " select your move(gun1, gun2, heal)");					//moves of player1
			String sel = sc.next();
			switch (sel) {
			case "gun1":
				betterPlayer.damageByGun1();
				break;
			case "gun2":
				betterPlayer.damageByGun2();
				break;
			case "heal":
				player.heal();
				break;
			default:
				System.out.println("Not availble");
			}
			System.out.println(betterPlayer.name + " select your move(gun1, gun2, heal)");				//moves of player2
			String sel2 = sc.next();
			switch (sel2) {
			case "gun1":
				player.damageByGun1();
				break;
			case "gun2":
				player.damageByGun2();
				break;
			case "heal":
				betterPlayer.heal();
				break;
			default:
				System.out.println("Not availble");
			}
		} while (player.health != 0 || betterPlayer.health != 0);
		sc.close();
	}
}
