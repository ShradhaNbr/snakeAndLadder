public class Snakeandladder {
	public static void main(String[] args) {
		int player_1 = 0;
		int option;
		int die_roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("You got" + die_roll);
		int option1 = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option1) {
		case 0: {
			System.out.println("Ladder");
			player_1 = player_1 + die_roll;
			break;
		}
		case 1: {
			System.out.println("Snake");
			player_1 = player_1 - die_roll;
			break;
		}
		default:
			System.out.println("You got no play");
		}
	}
}
