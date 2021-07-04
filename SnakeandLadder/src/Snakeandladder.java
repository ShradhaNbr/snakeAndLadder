public class Snakeandladder {
	public static void main(String[] args) {
		int player_position = 0;
		final int WINNING_POSITION = 100;
		while (player_position < WINNING_POSITION) {
			int die_roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("You got" + die_roll);
			int option1 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option1) {
			case 0: {
				System.out.println("Ladder");
				if ((player_position + die_roll) > 100)
					player_position = player_position;
				else
					player_position = player_position + die_roll;
				break;
			}
			case 1: {
				System.out.println("Snake");
				player_position = player_position - die_roll;
				break;
			}
			default:
				System.out.println("You got no play");
				if (player_position < 0)
					player_position = 0;

			}
		}
	}
}
